package designPatterns.creational.inCommonUse.n01singleton.case01;

/**
 * Created by chenjinxin on 2021/3/16 下午3:20
 */
// Logger类的应用示例：
public class UserController {
    private Logger logger = new Logger();

    public void login(String username, String password) {
        // ...省略业务逻辑代码...
        logger.log("username: " +username+ ", logined!");
    }
}
