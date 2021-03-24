package designPatterns.structural.inCommonUse.n04Adapter.case06;

import java.util.Arrays;
import java.util.List;

/**
 * Created by chenjinxin on 2021/3/24 下午4:52
 */
// 适配不同格式的数据
public class Demo {
    public static void main(String[] args) {
        List<String> stooges = Arrays.asList("Larry", "Moe", "Curly");
        System.out.println(stooges);
    }
}
