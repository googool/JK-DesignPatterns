package designPatterns.pattern01singleton.case01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by chenjinxin on 2021/3/16 下午3:19
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
