package designPatterns.creational.inCommonUse.n02Factory.case01;

/**
 * Created by chenjinxin on 2021/3/17 上午9:39
 */

/*
根据配置文件的后缀（json、xml、yaml、properties），选择不同的解析器（JsonRuleConfigParser、XmlRuleConfigParser……），
将存储在文件中的配置解析成内存对象 RuleConfig。
 */
public class Test {
    public static void main(String[] args) {
        RuleConfigSource ruleConfigSource = new RuleConfigSource();
        try {
            ruleConfigSource.load("");
        } catch (InvalidRuleConfigException e) {
            e.printStackTrace();
        }
    }
}
