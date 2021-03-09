package objectOriented.No14;

/**
 * Created by chenjinxin on 2021/3/9 下午2:03
 */
public interface ApiAuthenticator {
    void auth(String url);
    void auth(ApiRequest apiRequest);
}
