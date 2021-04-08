package openSourceCombat.case04Spring.case01;

import java.util.EventListener;

/**
 * Created by chenjinxin on 2021/4/8 下午5:00
 */
public interface ApplicationListener<E extends ApplicationEvent> extends EventListener {
    void onApplicationEvent(E var1);
}
