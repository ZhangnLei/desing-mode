package zhang.desingmode.observer;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * @author zhangnianlei
 * @create 2019/9/16.
 * @description Spring Boot应用启动后运行代码
 */
@Component
public class OnStartListener implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        System.out.println("Spring启动，执行一些初始化的操作...");
        //operate
    }
}
