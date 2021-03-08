package objectOriented.No08;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenjinxin on 2021/3/5 下午5:06
 */

class RpcRequest{}
class RpcException extends Throwable {}
// 接口
public interface Filter {
    void doFilter(RpcRequest req) throws RpcException;
}
// 接口实现类：鉴权过滤器
class AuthencationFilter implements Filter {
    @Override
    public void doFilter(RpcRequest req) throws RpcException {
        //...鉴权逻辑..
    }
}
// 接口实现类：限流过滤器
class RateLimitFilter implements Filter {
    @Override
    public void doFilter(RpcRequest req) throws RpcException {
        //...限流逻辑...
    }
}
// 过滤器使用Demo
class Application {
    // filters.add(new AuthencationFilter());
    // filters.add(new RateLimitFilter());
    private List<Filter> filters = new ArrayList<>();

    public void handleRpcRequest(RpcRequest req) {
        try {
            for (Filter filter : filters) {
                filter.doFilter(req);
            }
        } catch(RpcException e) {
            // ...处理过滤结果...
        }
        // ...省略其他处理逻辑...
    }
}
