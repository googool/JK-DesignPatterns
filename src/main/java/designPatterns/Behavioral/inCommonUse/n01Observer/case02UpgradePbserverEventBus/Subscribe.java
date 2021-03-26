package designPatterns.Behavioral.inCommonUse.n01Observer.case02UpgradePbserverEventBus;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by chenjinxin on 2021/3/26 下午2:09
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Beta
public @interface Subscribe {}
