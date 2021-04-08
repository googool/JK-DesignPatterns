package openSourceCombat.annotation;

/**
 * Created by chenjinxin on 2021/4/8 下午5:20
 */

import java.lang.annotation.*;

/**
 * 水果名称注解
 *
 * @author peida
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitName {
    String value() default "水果名称";
}
