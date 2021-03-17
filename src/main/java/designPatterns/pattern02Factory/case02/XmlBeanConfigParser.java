package designPatterns.pattern02Factory.case02;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenjinxin on 2021/3/17 下午2:04
 */
public class XmlBeanConfigParser extends BeanConfigParser {

    @Override
    public List<BeanDefinition> parse(InputStream inputStream) {
        String content = null;
        // TODO:...
        return parse(content);
    }

    @Override
    public List<BeanDefinition> parse(String configContent) {
        List<BeanDefinition> beanDefinitions = new ArrayList<>();
        // TODO:...
        return beanDefinitions;
    }

}
