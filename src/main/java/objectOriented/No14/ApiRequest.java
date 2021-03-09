package objectOriented.No14;

import java.util.HashMap;

/**
 * Created by chenjinxin on 2021/3/9 下午2:04
 */
public class ApiRequest {
    private String baseUrl;
    private String token;
    private String appId;
    private long timestamp;

    public ApiRequest(String baseUrl, String token, String appId, long timestamp) {
        this.baseUrl = baseUrl;
        this.token = token;
        this.appId = appId;
        this.timestamp = timestamp;
    }

    // http://www.cjx.com/user?id=1&appid=abc&token=xxx
    public static ApiRequest createFromFullUrl(String url) {
        String baseUrl = url.split("\\?")[0];
        String[] split = url.split("\\?")[1].split("&");
        HashMap<String, String> stringStringHashMap = new HashMap<>();
        for (String s : split) {
            String key = s.split("=")[0];
            String value = s.split("=")[1];
            stringStringHashMap.put(key, value);
        }
        String token = stringStringHashMap.get("token");
        String appId = stringStringHashMap.get("appid");
        long timestamp = System.currentTimeMillis();
        ApiRequest apiRequest = new ApiRequest(baseUrl, token, appId, timestamp);
        return apiRequest;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public String getToken() {
        return token;
    }

    public String getAppId() {
        return appId;
    }

    public long getTimestamp() {
        return timestamp;
    }
}
