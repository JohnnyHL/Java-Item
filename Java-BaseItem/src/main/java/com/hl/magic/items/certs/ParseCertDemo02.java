package com.hl.magic.items.certs;

import org.bouncycastle.asn1.*;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.encoders.Base64;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.Security;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/**
 * @Author HL
 * @Date 2021/6/8 20:29
 */
public class ParseCertDemo02 {

    @Test
    public void parse_cert() {
        ASN1Primitive asn1Primitive = null;
        ASN1InputStream ais = null;
        try {
            byte[] data = Files.readAllBytes(Paths.get("F:\\Tests\\Cert\\teResponse.txt"));
            ais = new ASN1InputStream(Base64.decode(data));
            while ((asn1Primitive = ais.readObject()) != null) {
                System.out.println("sequence==>" + asn1Primitive);
                if (asn1Primitive instanceof ASN1Integer) {
                    ASN1Integer asn1Integer = (ASN1Integer) asn1Primitive;
                    System.out.println("Integer:" + asn1Integer.getValue());
                } else if (asn1Primitive instanceof ASN1Boolean) {
                    ASN1Boolean asn1Boolean = (ASN1Boolean) asn1Primitive;
                    System.out.println("Boolean:" + asn1Boolean.isTrue());
                } else if (asn1Primitive instanceof ASN1UTCTime) {
                    ASN1UTCTime asn1UTCTime = (ASN1UTCTime) asn1Primitive;
                    System.out.println("asn1UTCTime:" + asn1UTCTime.getTime());
                } else if (asn1Primitive instanceof ASN1String) {
                    ASN1String asn1String = (ASN1String) asn1Primitive;
                    System.out.println("asn1String:" + asn1String.getString());
                } else if (asn1Primitive instanceof ASN1Sequence) {
                    ASN1Sequence sequence = (ASN1Sequence) asn1Primitive;
                    ASN1SequenceParser asn1SequenceParser = sequence.parser();
                    ASN1Encodable asn1Encodable = null;
                    while ((asn1Encodable = asn1SequenceParser.readObject()) != null) {
                        asn1Primitive = asn1Encodable.toASN1Primitive();
                        if (asn1Primitive instanceof ASN1String) {
                            ASN1String asn1String = (ASN1String) asn1Primitive;
                            System.out.println("asn1String==>" + asn1String.getString());
                        } else if (asn1Primitive instanceof ASN1UTCTime) {
                            ASN1UTCTime asn1UTCTime = (ASN1UTCTime) asn1Primitive;
                            System.out.println("asn1UTCTime==>" + asn1UTCTime.getTime());
                        } else if (asn1Primitive instanceof ASN1Null) {
                            System.out.println("=======================");
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                ais.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static X509Certificate certBytes2X509(byte[] cert)
            throws CertificateException, NoSuchProviderException {
        Security.addProvider(new BouncyCastleProvider());
        CertificateFactory cf = CertificateFactory.getInstance("X.509", "BC");
        return (X509Certificate) cf.generateCertificate(new ByteArrayInputStream(cert));
    }

    @Test
    public void run2() throws CertificateException, NoSuchProviderException, IOException {
        byte[] cert = Files.readAllBytes(Paths.get("F:\\Tests\\Cert-Test\\11.cer"));
        String s = new String(cert);

        boolean base64Encode = cn.com.jit.new_vstk.utils.Base64.isBase64(cert);
        System.out.println("【0】====>" + s);
        String hashAlg = "SM3";
        if (base64Encode){
            if(s.contains("BEGIN CERTIFICATE")||s.contains("END CERTIFICATE")){
                X509Certificate x509Certificate = certBytes2X509(cert);
                PublicKey publicKey = x509Certificate.getPublicKey();
                String algorithm = publicKey.getAlgorithm();
                if (algorithm.equalsIgnoreCase("RSA")) {
                    hashAlg = "SHA1";
                }
                System.out.println("【1】=======>" + hashAlg);
            } else {
                Certificate certificate = Certificate.getInstance(Base64.decode(cert));
                String id = certificate.getSignatureAlgorithm().getAlgorithm().getId();
                System.out.println("【2】=======>" + id);
                if(!id.equals("1.2.156.10197.1.501")){
                    hashAlg = "SHA1";
                }
                System.out.println("【2】=======>" + hashAlg);
            }
        } else {
            String s1 = Base64.toBase64String(cert);
            Certificate certificate = Certificate.getInstance(Base64.decode(s1));
            String id = certificate.getSignatureAlgorithm().getAlgorithm().getId();
            System.out.println("【3】=======>" + id);
            if(!id.equals("1.2.156.10197.1.501")){
                hashAlg = "SHA1";
            }
            System.out.println("【3】=======>" + hashAlg);
        }




    }

    @Test
    public void run3(){
        String cert = "510000:100001#510700:200002";
        String[] signcart = cert.split("#");
        String regionCode = null;
        for (String s  :signcart) {
            regionCode = s.split(":")[1];
            System.out.println("====>" + regionCode);
        }


    }

}
