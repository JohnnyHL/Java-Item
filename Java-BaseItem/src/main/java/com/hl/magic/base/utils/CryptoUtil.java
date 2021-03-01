package com.hl.magic.base.utils;

import cn.com.westone.common.array.ByteArrayUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Base64;

/**
 * @author zjj 2018-11-07
 * @version 1.0.0
 */
public class CryptoUtil {
    private static Logger logger = LoggerFactory.getLogger(CryptoUtil.class);

    private CryptoUtil() {

    }

    /**
     * 加解密模式
     */
    private static final String CIPHER_MODE = "DESede" + "/ECB/PKCS5Padding";

    /**
     * 密钥填充次数
     */
    private static final int PADDING_COUNT = 6;

    /**
     * 加密
     *
     * @param plain     明文
     * @param keyBase64 Base64编码的密钥
     * @return Base64编码的密文
     */
    public static String encrypt(String plain, String keyBase64) {
        try {
            Cipher cipher = Cipher.getInstance(CIPHER_MODE);
            cipher.init(Cipher.ENCRYPT_MODE, toKey(keyBase64));

            byte[] bytes = cipher.doFinal(plain.getBytes());

            return Base64.getEncoder().encodeToString(bytes);
        } catch (Exception e) {
            logger.error("加密失败，明文{}，密钥{}", plain, keyBase64, e);
            return null;
        }
    }

    /**
     * 解密
     *
     * @param cipherBase64 Base64编码的密文
     * @param keyBase64    Base64编码的密钥
     * @return 明文
     */
    public static String decrypt(String cipherBase64, String keyBase64) {
        try {
            byte[] cipherBytes = Base64.getDecoder().decode(cipherBase64);

            Cipher cipher = Cipher.getInstance(CIPHER_MODE);
            cipher.init(Cipher.DECRYPT_MODE, toKey(keyBase64));

            byte[] bytes = cipher.doFinal(cipherBytes);

            return new String(bytes);
        } catch (Exception e) {
            logger.error("解密失败，密文{}，密钥{}", cipherBase64, keyBase64, e);
            return null;
        }
    }

    /**
     * 构造密钥
     *
     * @param keyBase64 密钥数据
     * @return 密钥对象
     */
    private static Key toKey(String keyBase64) throws InvalidKeyException, NoSuchAlgorithmException, InvalidKeySpecException {
        byte[] tempKeyBytes = Base64.getDecoder().decode(keyBase64);
        String tempKeyHex = new String(tempKeyBytes);

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < PADDING_COUNT; i++) {
            builder.append(tempKeyHex);
        }

        String keyHex = builder.toString();
        byte[] keyBytes = ByteArrayUtil.hexString2Bytes(keyHex);

        DESedeKeySpec deSedeKeySpec = new DESedeKeySpec(keyBytes);
        SecretKeyFactory factory = SecretKeyFactory.getInstance("DESede");
        return factory.generateSecret(deSedeKeySpec);
    }
}
