package com.jerry.common.utils;

import io.jsonwebtoken.*;

import java.util.Date;
import java.util.Map;
import java.util.Objects;

/**
 * @Author jerry
 * @Description jwt工具类
 * @Date 2022-02-26 16:10
 * @Version 1.0
 **/
public class JwtUtil {

    /**
     * token生成
     *
     * @param id      id
     * @param subject 主体
     * @param map     其他自定义参数
     * @return
     */
    public static String generateJwt(String id, String subject, Map<String, Object> map) {
        JwtBuilder builder = Jwts.builder().setId(id)
                .setSubject(subject)
                .setIssuedAt(new Date())
                //1小时过期
                .setExpiration(new Date(System.currentTimeMillis() + 60 * 60 * 1000))
                //密钥
                .signWith(SignatureAlgorithm.HS256, "xyymyylyyrmmfyy");
        if (Objects.nonNull(map)) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                builder.claim(entry.getKey(), entry.getValue());
            }
        }
        return builder.compact();
    }

    /**
     * 解析token
     *
     * @param token
     * @return
     */
    public static Claims parseJwt(String token) {
        try {
            return Jwts.parser()
                    .setSigningKey("xyymyylyyrmmfyy")
                    .parseClaimsJws(token)
                    .getBody();
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 判断jwt是否过期
     *
     * @param token
     * @return
     */
    public static boolean tokenIsExpired(String token) {
        Claims claims = parseJwt(token);
        if (Objects.isNull(claims)) {
            return true;
        }
        return claims.getExpiration().before(new Date());
    }
}
