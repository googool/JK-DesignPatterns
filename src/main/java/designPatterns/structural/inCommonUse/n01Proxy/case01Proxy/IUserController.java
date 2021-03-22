package designPatterns.structural.inCommonUse.n01Proxy.case01Proxy;

import designPatterns.structural.inCommonUse.n01Proxy.case01.UserVo;

/**
 * Created by chenjinxin on 2021/3/22 下午4:34
 */

public interface IUserController {
    UserVo login(String telephone, String password);

    UserVo register(String telephone, String password);
}




