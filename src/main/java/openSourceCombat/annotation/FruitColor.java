package openSourceCombat.annotation;

/**
 * Created by chenjinxin on 2021/4/8 下午5:21
 */

import java.lang.annotation.*;

/**
 * 水果颜色注解
 *
 * @author peida
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitColor {
    /**
     * 颜色枚举
     *
     * @author peida
     */
    public enum Color {
        BULE, RED, GREEN
    }

    /**
     * 颜色属性
     *
     * @return
     */
    Color fruitColor() default Color.GREEN;

}
