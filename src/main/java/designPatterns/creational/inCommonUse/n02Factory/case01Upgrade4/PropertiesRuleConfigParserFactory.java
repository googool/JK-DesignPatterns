package designPatterns.creational.inCommonUse.n02Factory.case01Upgrade4;

import designPatterns.creational.inCommonUse.n02Factory.case01.IRuleConfigParser;
import designPatterns.creational.inCommonUse.n02Factory.case01.PropertiesRuleConfigParser;

/**
 * Created by chenjinxin on 2021/3/17 上午9:57
 */
public class PropertiesRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser() {
        return new PropertiesRuleConfigParser();
    }
}
