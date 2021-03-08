package objectOriented.No10.case3;

/**
 * Created by chenjinxin on 2021/3/8 上午9:36
 */

class FeignClient { // Feign Client框架代码
    //...省略其他代码...
    public void encode(String url) { //...
        //
    }
}

class CustomizedFeignClient extends FeignClient {
    @Override
    public void encode(String url) {
        //...重写encode的实现...
    }
}

public class Demo {
    public static void demofunction(FeignClient feignClient) {
        //...
        String url = "";
        feignClient.encode(url);
        //...
    }

    public static void main(String[] args) {
        // 调用
        FeignClient client = new CustomizedFeignClient();
        demofunction(client);
    }
}

