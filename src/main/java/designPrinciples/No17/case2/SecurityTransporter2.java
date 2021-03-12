package designPrinciples.No17.case2;

/**
 * Created by chenjinxin on 2021/3/10 下午4:55
 */
// 改造后：
/*public class SecurityTransporter2 extends Transporter {
    //...省略其他代码..
    @Override
    public Response sendRequest(Request request) {
        if (StringUtils.isBlank(appId) || StringUtils.isBlank(appToken)) {
            throw new NoAuthorizationRuntimeException(...);
        }
        request.addPayload("app-id", appId);
        request.addPayload("app-token", appToken);
        return super.sendRequest(request);
    }
}*/
