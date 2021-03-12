package designPrinciples.No16.case2;

/**
 * Created by chenjinxin on 2021/3/10 下午3:24
 */
public class ApiStatInfo {//省略constructor/getter/setter方法

    public ApiStatInfo(String api, long requestCount, long errorCount, long durationOfSeconds) {
        this.api = api;
        this.requestCount = requestCount;
        this.errorCount = errorCount;
        this.durationOfSeconds = durationOfSeconds;
    }

    public ApiStatInfo() {
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public long getRequestCount() {
        return requestCount;
    }

    public void setRequestCount(long requestCount) {
        this.requestCount = requestCount;
    }

    public long getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(long errorCount) {
        this.errorCount = errorCount;
    }

    public long getDurationOfSeconds() {
        return durationOfSeconds;
    }

    public void setDurationOfSeconds(long durationOfSeconds) {
        this.durationOfSeconds = durationOfSeconds;
    }

    private String api;
    private long requestCount;
    private long errorCount;
    private long durationOfSeconds;
}
