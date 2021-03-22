package designPatterns.structural.inCommonUse.n01Proxy.case01Proxy;

import designPatterns.structural.inCommonUse.n01Proxy.case01.UserVo;

/**
 * Created by chenjinxin on 2021/3/22 下午4:35
 */
public class UserController implements IUserController {
    //...省略其他属性和方法...

    @Override
    public UserVo login(String telephone, String password) {
        //...省略login逻辑...
        //...返回UserVo数据...
        return new UserVo();
    }

    @Override
    public UserVo register(String telephone, String password) {
        //...省略register逻辑...
        //...返回UserVo数据...
        return new UserVo();
    }
}
