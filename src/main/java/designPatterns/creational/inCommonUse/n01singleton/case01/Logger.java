package designPatterns.creational.inCommonUse.n01singleton.case01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by chenjinxin on 2021/3/16 下午3:19
 */

// 实战案例一：处理资源访问冲突
/*
在 Web 容器的 Servlet 多线程环境下，如果两个 Servlet 线程同时分别执行 login() 和 create() 两个函数，
并且同时写日志到 log.txt 文件中，那就有可能存在日志信息互相覆盖的情况。
 */
public class Logger {
    private FileWriter writer;

    public Logger() {
        File file = new File("log.txt");
        try {
            writer = new FileWriter(file, true); //true表示追加写入
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void log(String message) {
        try {
            writer.write(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
