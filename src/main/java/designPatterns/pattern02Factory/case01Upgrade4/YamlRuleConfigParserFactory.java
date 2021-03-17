package designPatterns.pattern02Factory.case01Upgrade4;

import designPatterns.pattern02Factory.case01.IRuleConfigParser;
import designPatterns.pattern02Factory.case01.YamlRuleConfigParser;

/**
 * Created by chenjinxin on 2021/3/17 上午9:57
 */
public class YamlRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser() {
        return new YamlRuleConfigParser();
    }
}
