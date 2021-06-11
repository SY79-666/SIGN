package com.project.signin.Utils;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.time.DateUtils;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;

import javax.xml.crypto.Data;

/**
 * @author suyu
 */
@Slf4j
public class JwtUtils {
    /**
     * 签发时间
     */
    private static final String TIME_FILED = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());

    /**
     * 签发者
     */
    private static final String ISSUER = "SuYu";

    /**
     * 生成token
     *
     * @param claims
     * @return
     */
    public static String createToken(Map<String, String> claims) throws Exception {
        String token ;

        try {
            Algorithm algorithm = Algorithm.HMAC256(TIME_FILED);
            JWTCreator.Builder builder = JWT.create()
                    .withIssuer(ISSUER)
                    //设置过期时间为2小时
                    .withExpiresAt(DateUtils.addHours(new Date(), 2));
            claims.forEach(builder::withClaim);
            token = builder.sign(algorithm);
        } catch (IllegalArgumentException e) {
            throw new Exception("生成token失败");
        }
        log.info("加密后token:" + token);
        return token;
    }

    /**
     * 验证jwt，并返回数据
     */
    public static Map<String, String> verifyToken(String token) throws Exception {
        Algorithm algorithm;
        Map<String, Claim> map;
        DecodedJWT decodedJWT = null;
        try {
            algorithm = Algorithm.HMAC256(TIME_FILED);
            JWTVerifier verifier = JWT.require(algorithm).withIssuer(ISSUER).build();
            DecodedJWT jwt = verifier.verify(token);
            map = jwt.getClaims();
            log.info("签发者:" + ISSUER + "加密方式:" + decodedJWT.getAlgorithm() + "携带信息:" + decodedJWT.getClaim("User"));
        } catch (Exception e) {
            log.error("jwt解密出现错误，jwt或私钥或签证人不正确");
            throw new Exception("鉴权失败");
        }
        Map<String, String> resultMap = new HashMap<>(map.size());
        map.forEach((k, v) -> resultMap.put(k, v.asString()));
        return resultMap;
    }
}

