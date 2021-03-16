package designPatterns.pattern01singleton.case01upgrade;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by chenjinxin on 2021/3/16 下午3:40
 */

/*
这种锁是一个对象级别的锁，一个对象在不同的线程下同时调用 log() 函数，会被强制要求顺序执行。
但是，不同的对象之间并不共享同一把锁。在不同的线程下，通过不同的对象调用执行 log() 函数，锁并不会起作用，仍然有可能存在写入日志互相覆盖的问题。
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
        给 log() 函数加互斥锁（Java 中可以通过 synchronized 的关键字），同一时刻只允许一个线程调用执行 log() 函数。
         */
        synchronized(this) {
            try {
                writer.write(message);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
/*
我们给 log() 函数加不加对象级别的锁，其实都没有关系。
因为 FileWriter 本身就是线程安全的，它的内部实现中本身就加了对象级别的锁，
因此，在外层调用 write() 函数的时候，再加对象级别的锁实际上是多此一举。
因为不同的 Logger 对象不共享 FileWriter 对象，所以，FileWriter 对象级别的锁也解决不了数据写入互相覆盖的问题。
 */
