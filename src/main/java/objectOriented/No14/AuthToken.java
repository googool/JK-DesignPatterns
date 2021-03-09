package objectOriented.No14;

import sun.security.provider.MD5;
import sun.security.provider.SHA;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

/**
 * Created by chenjinxin on 2021/3/9 下午2:18
 */
public class AuthToken {
    private static final long DEFAULT_EXPIRED_TIME_INTERVAL = 1 * 60 * 1000;
    private String token;
    private long createTime;
    private long expiredTimeInterval = DEFAULT_EXPIRED_TIME_INTERVAL;

    public AuthToken(String token, long createTime) {
        this.token = token;
        this.createTime = createTime;
    }

    public AuthToken(String token, long createTime, long expiredTimeInterval) {
        this.token = token;
        this.createTime = createTime;
        this.expiredTimeInterval = expiredTimeInterval;
    }

    // token = SHA(http://www.cjx.com/user?id=1&appid=abc&pwd=def123)
    public static AuthToken create(String baseUrl, long createTime, Map<String, String> params) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        md5.update(baseUrl.getBytes(StandardCharsets.UTF_8));
        byte[] s = md5.digest();
        StringBuilder result = new StringBuilder();
        for (byte b : s) {
            result.append(Integer.toHexString((0x000000ff & b) | 0xffffff00).substring(6));
        }
        String token = result.toString();
        return new AuthToken(token, createTime, DEFAULT_EXPIRED_TIME_INTERVAL);
    }

    public String getToken() {
        return this.token;
    }

    public boolean isExpired() {
        return (System.currentTimeMillis() - this.createTime < DEFAULT_EXPIRED_TIME_INTERVAL);
    }

    public boolean match(AuthToken authToken) {
        return false;
    }
}
