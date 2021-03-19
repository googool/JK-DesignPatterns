package designPatterns.creational.inCommonUse.n02Factory.case02;

/**
 * Created by chenjinxin on 2021/3/17 下午2:03
 */
public interface ApplicationContext {
    Object getBean(String beanId) throws BeanCreationFailureException, NoSuchBeanDefinitionException;
}
