package designPatterns.creational.inCommonUse.n01singleton.case01upgrade2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by chenjinxin on 2021/3/16 下午3:45
 */

public class Logger {
    private FileWriter writer;

    public Logger() {
        File file = new File("/Users/wangzheng/log.txt");
        try {
            writer = new FileWriter(file, true); //true表示追加写入
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void log(String message) {
        /*
        把对象级别的锁，换成类级别的锁就可以了。
        让所有的对象都共享同一把锁。这样就避免了不同对象之间同时调用 log() 函数，而导致的日志覆盖问题。
         */
        synchronized(Logger.class) { // 类级别的锁
            try {
                writer.write(message);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
/*
并发队列（比如 Java 中的 BlockingQueue）也可以解决这个问题：
多个线程同时往并发队列里写日志，一个单独的线程负责将并发队列中的数据，写入到日志文件。
 */