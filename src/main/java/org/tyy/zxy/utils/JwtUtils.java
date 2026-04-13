package org.tyy.zxy.utils;

import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.security.Key;
import java.util.Date;

@Component
public class JwtUtils {

    @Value("${jwt.secret}")
    private String secret;

    @Value("${jwt.access-token-expire}")
    private Long accessTokenExpire;

    private Key getKey() {
        return Keys.hmacShaKeyFor(secret.getBytes());
    }

    // 生成 Access Token
    public String generateAccessToken(Long userId, String username) {
        Date now = new Date();
        Date expiration = new Date(now.getTime() + accessTokenExpire);
        return Jwts.builder()
                .setSubject(String.valueOf(userId))
                .claim("username", username)
                .setIssuedAt(now)
                .setExpiration(expiration)
                .signWith(getKey(), SignatureAlgorithm.HS256)
                .compact();
    }

    // 生成 Refresh Token（过期时间可自定义）
    public String generateRefreshToken(Long userId, String username, Long expireMillis) {
        Date now = new Date();
        Date expiration = new Date(now.getTime() + expireMillis);
        return Jwts.builder()
                .setSubject(String.valueOf(userId))
                .claim("username", username)
                .setIssuedAt(now)
                .setExpiration(expiration)
                .signWith(getKey(), SignatureAlgorithm.HS256)
                .compact();
    }

    // 解析 Token
    public Claims parseToken(String token) {
        try {
            return Jwts.parserBuilder()
                    .setSigningKey(getKey())
                    .build()
                    .parseClaimsJws(token)
                    .getBody();
        } catch (ExpiredJwtException e) {
            throw new RuntimeException("Token 已过期");
        } catch (JwtException e) {
            throw new RuntimeException("Token 无效");
        }
    }

    public Integer getUserId(String token) {
        return Integer.parseInt(parseToken(token).getSubject());
    }

    public String getUsername(String token) {
        return parseToken(token).get("username", String.class);
    }

    public boolean isTokenExpired(String token) {
        try {
            parseToken(token);
            return false;
        } catch (RuntimeException e) {
            return e.getMessage().contains("过期");
        }
    }
}