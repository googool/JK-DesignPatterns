package designPatterns.Behavioral.inCommonUse.n04ChainOfResponsibility.case04;

/**
 * Created by chenjinxin on 2021/3/30 下午2:10
 */
public class PoliticalWordFilter implements SensitiveWordFilter {
    @Override
    public boolean doFilter(Content content) {
        boolean legal = true;
        //...
        return legal;
    }
}