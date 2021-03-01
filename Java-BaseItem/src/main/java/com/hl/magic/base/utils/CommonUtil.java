package com.hl.magic.base.utils;

import cn.com.westone.common.array.ByteArrayUtil;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.*;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;

public class CommonUtil {
    /**
     * int转byte
     *
     * @param num
     * @return
     */
    public static byte[] int2bytes(int num) {
        byte[] b = new byte[4];
        int mask = 0xff;
        for (int i = 0; i < 4; i++) {
            b[3 - i] = (byte) (num >>> (24 - i * 8));
        }
        return b;
    }


    /**
     * 从证书获取公钥
     *
     * @param cert 证书
     * @return PublicKey  公钥
     */
    public static PublicKey getPkFromCert(byte[] cert) throws CertificateException, NoSuchProviderException {
        return certBytes2X509(cert).getPublicKey();
    }

    /**
     * 证书byte数组转换成X509Certificate对象
     *
     * @param cert 证书
     * @return X509Certificate
     * @throws CertificateException
     * @throws NoSuchProviderException
     */
    public static X509Certificate certBytes2X509(byte[] cert) throws CertificateException, NoSuchProviderException {
        //先系统位置BC库与添加的库冲突
        Security.removeProvider("BC");
        Security.addProvider(new BouncyCastleProvider());
        CertificateFactory cf = CertificateFactory.getInstance("X.509", "BC");
        return (X509Certificate) cf.generateCertificate(new ByteArrayInputStream(cert));
    }


    /**
     * X.509公钥转换成ref结构公钥
     *
     * @param publicKey
     * @return
     */
    public static byte[] sm2X5092Ref(PublicKey publicKey) {
        byte[] refPk = new byte[68];
        System.arraycopy(ByteArrayUtil.BigEndian.toByteArray(1, 2), 0, refPk, 0, 2);
        System.arraycopy(ByteArrayUtil.BigEndian.toByteArray(0, 2), 0, refPk, 2, 2);
        System.arraycopy(publicKey.getEncoded(), publicKey.getEncoded().length - 64, refPk, 4, 64);
        return refPk;
    }

    public static byte[] rsaX5092Ref(PublicKey publicKey) {
        RSAPublicKey key = (RSAPublicKey) publicKey;
        int bitLength = key.getModulus().bitLength();

        byte[] m = CommonUtil.bigIntegerToBytes(key.getModulus());
        byte[] e = CommonUtil.bigIntegerToBytes(key.getPublicExponent());

        byte[] bit = CommonUtil.int2bytes(bitLength);

        byte[] refPk = new byte[bit.length + m.length + e.length];

        System.arraycopy(bit, 0, refPk, 0, bit.length);
        System.arraycopy(m, 0, refPk, bit.length, m.length);
        System.arraycopy(e, 0, refPk, bit.length + m.length, e.length);
        return refPk;
    }

    public static byte[] bigIntegerToBytes(BigInteger bigInteger) {
        int bitLength = bigInteger.bitLength() / 8;
        byte[] result = new byte[bitLength];
        byte[] bytes = bigInteger.toByteArray();
        if (bytes.length == bitLength + 1 && bytes[0] == 0) {
            byte[] temp = new byte[bytes.length - 1];
            ByteBuffer buffer = ByteBuffer.wrap(bytes);
            buffer.position(1);
            buffer.get(temp);
            return temp;
        } else {
            return bytes;
        }
    }

    /**
     * 使用软算法在外部做hash
     *
     * @param data
     * @param hashAlg
     * @return
     * @throws NoSuchProviderException
     * @throws NoSuchAlgorithmException
     */
    public static byte[] doHash(byte[] data, String hashAlg) throws NoSuchProviderException, NoSuchAlgorithmException {
        Security.addProvider(new BouncyCastleProvider());
        MessageDigest messageDigest = MessageDigest.getInstance(hashAlg, BouncyCastleProvider.PROVIDER_NAME);
        messageDigest.update(data);
        return messageDigest.digest();
    }
}
