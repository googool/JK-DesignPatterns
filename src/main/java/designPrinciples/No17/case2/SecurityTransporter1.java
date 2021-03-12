package designPrinciples.No17.case2;

/**
 * Created by chenjinxin on 2021/3/10 下午4:55
 */

// 改造前：
/*public class SecurityTransporter1 extends Transporter {
    //...省略其他代码..
    @Override
    public Response sendRequest(Request request) {
        if (StringUtils.isNotBlank(appId) && StringUtils.isNotBlank(appToken)) {
            request.addPayload("app-id", appId);
            request.addPayload("app-token", appToken);
        }
        return super.sendRequest(request);
    }
}*/


