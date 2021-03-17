package designPatterns.pattern02Factory.case01Upgrade4;

import designPatterns.pattern02Factory.case01.IRuleConfigParser;
import designPatterns.pattern02Factory.case01.JsonRuleConfigParser;

/**
 * Created by chenjinxin on 2021/3/17 上午9:56
 */
public class JsonRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser() {
        return new JsonRuleConfigParser();
    }
}
