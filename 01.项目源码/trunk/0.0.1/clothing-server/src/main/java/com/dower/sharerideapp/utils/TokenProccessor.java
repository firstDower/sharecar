package com.dower.sharerideapp.utils;


import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;
import java.util.Date;

/**
 * @Author: litong
 * @Date: 2019/2/28 11:24
 * @Description:
 */
public class TokenProccessor {

    /**
     * 签名秘钥,可以换成 秘钥 注入
     */
    public static final String SECRET = "doweryouxia";
    /**
     * 签发地
     */
    public static final String issuer = "doweryouxia.com";
    /**
     * 过期时间(毫秒)
     */
    public static final long ttlMillis = 1000 * 60 * 60 * 4;

    /**
     * 生成token
     *
     * @param id 一般传入userName
     * @return
     */
    public static String createJwtToken(String id, String subject) {
        return createJwtToken(id, issuer, subject, ttlMillis);
    }

    public static String createJwtToken(String id) {
        return createJwtToken(id, issuer, "", ttlMillis);
    }

    /**
     * 生成Token
     *
     * @param id        编号
     * @param issuer    该JWT的签发者，是否使用是可选的
     * @param subject   该JWT所面向的用户，是否使用是可选的；
     * @param ttlMillis 签发时间 （有效时间，过期会报错）
     * @return token String
     */
    public static String createJwtToken(String id, String issuer, String subject, long ttlMillis) {

        // 签名算法 ，将对token进行签名
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;

        // 生成签发时间
        long nowMillis = System.currentTimeMillis();
        Date now = new Date(nowMillis);

        // 通过秘钥签名JWT
        byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary(SECRET);
        Key signingKey = new SecretKeySpec(apiKeySecretBytes, signatureAlgorithm.getJcaName());

        // 让我们设置JWT声明
        JwtBuilder builder = Jwts.builder().setId(id)
                .setIssuedAt(now)
                .setSubject(subject)
                .setIssuer(issuer)
                .signWith(signatureAlgorithm, signingKey);

        // if it has been specified, let's add the expiration
        if (ttlMillis >= 0) {
            long expMillis = nowMillis + ttlMillis;
            Date exp = new Date(expMillis);
            builder.setExpiration(exp);
        }

        // 构建JWT并将其序列化为一个紧凑的url安全字符串
        return builder.compact();

    }

    /**
     * Token解析方法
     *
     * @param jwt Token
     * @return
     */
    public static Claims parseJWT(String jwt) {
        // 如果这行代码不是签名的JWS(如预期)，那么它将抛出异常
        Claims claims = Jwts.parser()
                .setSigningKey(DatatypeConverter.parseBase64Binary(SECRET))
                .parseClaimsJws(jwt).getBody();
        return claims;
    }

    public static void main(String[] args) {

        long l = System.currentTimeMillis();
        String token = TokenProccessor.createJwtToken("eyJhbGciOiJIUzI1NiJ9", "ltz");
        long l2 = System.currentTimeMillis();
        System.out.println(token);

        Claims claims = TokenProccessor.parseJWT(token);
        String token2 = "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiIxIiwiaWF0IjoxNTk1NTc2Mzk2LCJzdWIiOiJsdHoiLCJpc3MiOiJkb3dlcnlvdXhpYS5jb20iLCJleHAiOjE1OTU3OTIzOTZ9.mHTYgZBobBmxjn1MFQBRubcqpHp9TDvxv1MY2_kknfc";
       // String token2 = "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJleUpoYkdjaU9pSklVekkxTmlKOSIsImlhdCI6MTU5NTU3NjgxMywic3ViIjoibHR6IiwiaXNzIjoiZG93ZXJ5b3V4aWEuY29tIiwiZXhwIjoxNTk1NTg0MDEzfQ.JSV2Wj2eH5tA_WmAD6AYAiN6S_vR9vGk--Us6UkROVQ";

        Claims claims2 = TokenProccessor.parseJWT(token2);

        System.out.println(claims);
        System.out.println(claims2);
        System.out.println(System.currentTimeMillis()/1000);

        System.out.println("耗时间"+(l2-l));
    }


}
