package designPatterns.Behavioral.inCommonUse.n03Strategy.case04;

/**
 * Created by chenjinxin on 2021/3/30 上午9:57
 */
public class SortingTool {
    public static void main(String[] args) {
        Sorter sorter = new Sorter();
        sorter.sortFile(args[0]);
    }
}
