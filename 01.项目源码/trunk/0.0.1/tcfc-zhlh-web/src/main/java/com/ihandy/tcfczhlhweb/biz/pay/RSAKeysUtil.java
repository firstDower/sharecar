package com.ihandy.tcfczhlhweb.biz.pay;


import org.apache.commons.lang3.StringUtils;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.crypto.Cipher;
import java.io.ByteArrayOutputStream;
import java.net.URLEncoder;
import java.security.*;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


/**
 * Created by xuliugen on 2017/6/25.
 */
public class RSAKeysUtil {

    public static final String KEY_ALGORITHM = "RSA";
    public static final String SIGNATURE_ALGORITHM = "RSA/ECB/PKCS1Padding";
    private static final String PUBLIC_KEY = "RSAPublicKey";
    private static final String PRIVATE_KEY = "RSAPrivateKey";

    public static void main(String[] args) {
        Map<String, Object> keyMap;
        try {
            keyMap = initKey();
            String publicKey = getPublicKeyUtil(keyMap);
            System.out.println(publicKey);
            String privateKey = getPrivateKeyUtil(keyMap);
            System.out.println(privateKey);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getPublicKeyUtil(Map<String, Object> keyMap) throws Exception {
        Key key = (Key) keyMap.get(PUBLIC_KEY);
        byte[] publicKey = key.getEncoded();
        return encryptBASE64(key.getEncoded());
    }

    public static String getPrivateKeyUtil(Map<String, Object> keyMap) throws Exception {
        Key key = (Key) keyMap.get(PRIVATE_KEY);
        byte[] privateKey = key.getEncoded();
        return encryptBASE64(key.getEncoded());
    }

    public static byte[] decryptBASE64(String key) throws Exception {
        return (new BASE64Decoder()).decodeBuffer(key);
    }

    public static String encryptBASE64(byte[] key) throws Exception {
        return (new BASE64Encoder()).encodeBuffer(key);
    }

    public static String decrypt(String cipherText) throws Exception {
		return decrypt((String) null, cipherText);
	}

	public static String decrypt(String publicKeyText, String cipherText)
			throws Exception {
		PublicKey publicKey = getPublicKey(publicKeyText);

		return decrypt(publicKey, cipherText);
	}

	public static byte[] RSAEncode(PrivateKey key, byte[] plainText) {

		try {
			Cipher cipher = Cipher.getInstance(SIGNATURE_ALGORITHM);
			cipher.init(Cipher.ENCRYPT_MODE, key);
			return cipher.doFinal(plainText);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public static PublicKey getPublicKeyStr(String publicKey) throws Exception{
	    byte[] keyBytes = Base64.base64ToByteArray(publicKey);
	    X509EncodedKeySpec spec = new X509EncodedKeySpec(keyBytes);
	    KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
	    return (PublicKey) keyFactory.generatePublic(spec);
	}

	public static PrivateKey getPrivateKeyStr(String privateKey) throws Exception{
	    byte[] keyBytes = Base64.base64ToByteArray(privateKey);
	    PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(keyBytes);
	    KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
	    return (PrivateKey) keyFactory.generatePrivate(spec);
	}


	public static PublicKey getPublicKey(String publicKeyText) {
		if (publicKeyText == null || publicKeyText.length() == 0) {
			publicKeyText = RSAKeysUtil.SIGNATURE_ALGORITHM;
		}

		try {
			byte[] publicKeyBytes = Base64.base64ToByteArray(publicKeyText);
			X509EncodedKeySpec x509KeySpec = new X509EncodedKeySpec(
					publicKeyBytes);

			KeyFactory keyFactory = KeyFactory.getInstance("RSA");
			return keyFactory.generatePublic(x509KeySpec);
		} catch (Exception e) {
			throw new IllegalArgumentException("Failed to get public key", e);
		}
	}

	public static String encrtypt(String str,PrivateKey privateKey) throws Exception {

			Cipher cipher = Cipher.getInstance(SIGNATURE_ALGORITHM);
			cipher.init(Cipher.ENCRYPT_MODE, privateKey); // 私钥加密

		//	byte[] encrypt = cipher.doFinal(str.getBytes());

			byte[] encrypt = decryptByPrivateKey(cipher,str.getBytes());

			return new String(org.apache.commons.codec.binary.Base64.encodeBase64(encrypt));

		}



	public static String decrypt(PublicKey publicKey, String cipherText)
			throws Exception {
		Cipher cipher = Cipher.getInstance("RSA");
		try {
			cipher.init(Cipher.DECRYPT_MODE, publicKey);
		} catch (InvalidKeyException e) {
            // 因为 IBM JDK 不支持私钥加密, 公钥解密, 所以要反转公私钥
            // 也就是说对于解密, 可以通过公钥的参数伪造一个私钥对象欺骗 IBM JDK
            RSAPublicKey rsaPublicKey = (RSAPublicKey) publicKey;
            RSAPrivateKeySpec spec = new RSAPrivateKeySpec(rsaPublicKey.getModulus(), rsaPublicKey.getPublicExponent());
            Key fakePrivateKey = KeyFactory.getInstance("RSA").generatePrivate(spec);
            cipher = Cipher.getInstance("RSA"); //It is a stateful object. so we need to get new one.
            cipher.init(Cipher.DECRYPT_MODE, fakePrivateKey);
		}

		if (cipherText == null || cipherText.length() == 0) {
			return cipherText;
		}

		byte[] cipherBytes = Base64.base64ToByteArray(cipherText);
		byte[] plainBytes = cipher.doFinal(cipherBytes);

		return new String(plainBytes);
	}

	public static String encrypt(String plainText) throws Exception {
		return encrypt((String) null, plainText);
	}

	public static String encrypt(String key, String plainText) throws Exception {
		if (key == null) {
			key = SIGNATURE_ALGORITHM;
		}

		byte[] keyBytes = Base64.base64ToByteArray(key);
		return encrypt(keyBytes, plainText);
	}

	public static String encrypt(byte[] keyBytes, String plainText)
			throws Exception {
		PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(keyBytes);
		KeyFactory factory = KeyFactory.getInstance("RSA");
		PrivateKey privateKey = factory.generatePrivate(spec);
		Cipher cipher = Cipher.getInstance("RSA");
        try {
		    cipher.init(Cipher.ENCRYPT_MODE, privateKey);
        } catch (InvalidKeyException e) {
            //For IBM JDK, 原因请看解密方法中的说明
            RSAPrivateKey rsaPrivateKey = (RSAPrivateKey) privateKey;
            RSAPublicKeySpec publicKeySpec = new RSAPublicKeySpec(rsaPrivateKey.getModulus(), rsaPrivateKey.getPrivateExponent());
            Key fakePublicKey = KeyFactory.getInstance("RSA").generatePublic(publicKeySpec);
            cipher = Cipher.getInstance("RSA");
            cipher.init(Cipher.ENCRYPT_MODE, fakePublicKey);
        }

		byte[] encryptedBytes = cipher.doFinal(plainText.getBytes("UTF-8"));
		String encryptedString = Base64.byteArrayToBase64(encryptedBytes);

		return encryptedString;
	}

	public static byte[][] genKeyPairBytes(int keySize)
			throws NoSuchAlgorithmException {
		byte[][] keyPairBytes = new byte[2][];

		KeyPairGenerator gen = KeyPairGenerator.getInstance("RSA");
		gen.initialize(keySize, new SecureRandom());
		KeyPair pair = gen.generateKeyPair();

		keyPairBytes[0] = pair.getPrivate().getEncoded();
		keyPairBytes[1] = pair.getPublic().getEncoded();

		return keyPairBytes;
	}

	public static String[] genKeyPair(int keySize)
			throws NoSuchAlgorithmException {
		byte[][] keyPairBytes = genKeyPairBytes(keySize);
		String[] keyPairs = new String[2];

		keyPairs[0] = Base64.byteArrayToBase64(keyPairBytes[0]);
		keyPairs[1] = Base64.byteArrayToBase64(keyPairBytes[1]);

		return keyPairs;
	}

	public static String encrtypt(String str,String private_KEY_STRING) throws Exception {
			PrivateKey privateKey = getPrivateKeyStr(private_KEY_STRING);
			Cipher cipher = Cipher.getInstance(SIGNATURE_ALGORITHM);
			cipher.init(Cipher.ENCRYPT_MODE, privateKey); // 私钥加密
			byte[] encrypt = cipher.doFinal(str.getBytes());
			return new String(org.apache.commons.codec.binary.Base64.encodeBase64(encrypt));

	}

	 public static String scort(Map<String, String> params,String charset) throws Exception {
  	   Map<String, String> sortMap = new TreeMap<String, String>();
  	   sortMap.putAll(params);
  	   // 以k1=v1&k2=v2...方式拼接参数
  	   StringBuilder builder = new StringBuilder();
  	   for (Map.Entry<String, String> s : sortMap.entrySet()) {
  	       String k = s.getKey();
  	       String v = s.getValue();
  	       if (StringUtils.isBlank(v)) {// 过滤空值
  	           continue;
  	       }
  	       if(StringUtils.isBlank(charset)){
      	       builder.append(k).append("=").append(URLEncoder.encode(v,charset)).append("&");
  	       }else{
      	       builder.append(k).append("=").append(URLEncoder.encode(v)).append("&");
  	       }
  	   }
  	   if (!sortMap.isEmpty()) {
  	       builder.deleteCharAt(builder.length() - 1);
  	   }
  	   return builder.toString();
  	}

	 public static boolean verifySign(String data,String sign,PublicKey publicKey) throws Exception{

 		Signature pubsignature = Signature.getInstance("SHA256withRSA");   //SHA256withRSA
 		pubsignature.initVerify(publicKey);
 		pubsignature.update(data.getBytes("UTF-8"));

 		return pubsignature.verify(org.apache.commons.codec.binary.Base64.decodeBase64(sign.getBytes()));
    }


	 public static byte[] decryptByPrivateKey(Cipher cipher, byte[] encryptedData) throws Exception {
	        int inputLen = encryptedData.length;
	        ByteArrayOutputStream out = new ByteArrayOutputStream();
	        int offSet = 0;

	        for(int i = 0; inputLen - offSet > 0; offSet = i * 256) {
	            byte[] cache;
	            if(inputLen - offSet > 256) {
	                cache = cipher.doFinal(encryptedData, offSet, 256);
	            } else {
	                cache = cipher.doFinal(encryptedData, offSet, inputLen - offSet);
	            }

	            out.write(cache, 0, cache.length);
	            ++i;
	        }

	        byte[] decryptedData = out.toByteArray();
	        out.close();
	        return decryptedData;
	    }

	    public static byte[] encryptByPublicKey(Cipher cipher, byte[] data) throws Exception {
	        int inputLen = data.length;
	        ByteArrayOutputStream out = new ByteArrayOutputStream();
	        int offSet = 0;

	        for(int i = 0; inputLen - offSet > 0; offSet = i * 256) {
	            byte[] cache;
	            if(inputLen - offSet > 256) {
	                cache = cipher.doFinal(data, offSet, 256);
	            } else {
	                cache = cipher.doFinal(data, offSet, inputLen - offSet);
	            }

	            out.write(cache, 0, cache.length);
	            ++i;
	        }

	        byte[] encryptedData = out.toByteArray();
	        out.close();
	        return encryptedData;
	    }





    public static Map<String, Object> initKey() throws Exception {
        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance(KEY_ALGORITHM);
        keyPairGen.initialize(2048);
        KeyPair keyPair = keyPairGen.generateKeyPair();
        RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();
        RSAPrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate();
        Map<String, Object> keyMap = new HashMap<String, Object>(2);
        keyMap.put(PUBLIC_KEY, publicKey);
        keyMap.put(PRIVATE_KEY, privateKey);
        return keyMap;
    }
}