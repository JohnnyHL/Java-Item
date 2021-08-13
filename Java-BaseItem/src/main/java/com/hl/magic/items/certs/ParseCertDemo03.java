package com.hl.magic.items.certs;

import com.hl.magic.items.utils.ByteArrayUtil;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Security;

/**
 * @Author HL
 * @Date 2021/6/8 20:29
 */
public class ParseCertDemo03 {


    /**
     * 外部做HASH
     *
     * @param data
     * @param hashAlg
     * @return
     * @throws NoSuchProviderException
     * @throws NoSuchAlgorithmException
     */
    public byte[] doHash1(byte[] data, String hashAlg)
            throws NoSuchProviderException, NoSuchAlgorithmException {
        Security.addProvider(new BouncyCastleProvider());
        MessageDigest messageDigest = MessageDigest.getInstance(hashAlg, "BC");
        messageDigest.update(data);
        return messageDigest.digest();
    }


    @Test
    public void run2() throws IOException, NoSuchAlgorithmException, NoSuchProviderException {
        byte[] cert = Files.readAllBytes(Paths.get("F:\\Tests\\Cert-Test\\DJ_Seal.etp"));
        byte[] sm31 = doHash1(cert, "SM3");
        String hash1 = ByteArrayUtil.toHexString(sm31);
        System.out.println("====>[1]hash值：" + hash1);
        System.out.println("===========================================================");
    }
}
