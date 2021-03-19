package designPatterns.creational.inCommonUse.n01singleton.case01Singleton;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by chenjinxin on 2021/3/16 下午4:14
 */

public class Logger {
    private FileWriter writer;
    private static final Logger instance = new Logger();

    private Logger() {
        File file = new File("/Users/wangzheng/log.txt");
        try {
            writer = new FileWriter(file, true); //true表示追加写入
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Logger getInstance() {
        return instance;
    }

    public void log(String message) {
        try {
            writer.write(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
