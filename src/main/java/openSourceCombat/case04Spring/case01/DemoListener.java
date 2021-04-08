package openSourceCombat.case04Spring.case01;

/**
 * Created by chenjinxin on 2021/4/8 下午4:57
 */
// Listener监听者
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {
    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String message = demoEvent.getMessage();
        System.out.println(message);
    }
}