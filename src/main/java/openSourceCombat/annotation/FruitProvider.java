package openSourceCombat.annotation;

/**
 * Created by chenjinxin on 2021/4/8 下午5:21
 */

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitProvider {
    /**
     * 供应商编号
     *
     * @return
     */
    public int id() default -1;

    /**
     * 供应商名称
     *
     * @return
     */
    public String name() default "供应商名称";

    /**
     * 供应商地址
     *
     * @return
     */
    public String address() default "供应商地址";
}
