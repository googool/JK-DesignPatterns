package designPatterns.structural.inCommonUse.n03decorator.case01JavaIO;

import java.io.*;
import java.util.Arrays;

/**
 * Created by chenjinxin on 2021/3/23 下午4:01
 */
public class Demo {
    public static void main(String[] args) throws IOException {

        io2();

    }

    public static void io1() throws IOException {
        InputStream in = new FileInputStream("src/main/java/designPatterns/structural/inCommonUse/n03decorator/test.txt");
        InputStream bin = new BufferedInputStream(in);
        byte[] data = new byte[128];
        while (bin.read(data) != -1) {
            System.out.println(Arrays.toString(data));
        }
    }

    public static void io2() throws IOException {
        InputStream in = new FileInputStream("src/main/java/designPatterns/structural/inCommonUse/n03decorator/testInt.txt");
        InputStream bin = new BufferedInputStream(in);
        DataInputStream din = new DataInputStream(bin);
        int data = din.readInt();
        System.out.println(data);
    }

}
