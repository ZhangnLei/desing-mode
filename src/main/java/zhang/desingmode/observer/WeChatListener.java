package zhang.desingmode.observer;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author zhangnianlei
 * @create 2019/9/16.
 * @description 微信监听
 */
@Component
public class WeChatListener implements ApplicationListener<OrderEvent> {
    @Override
    public void onApplicationEvent(OrderEvent applicationEvent) {
        System.out.println("发送微信通知");
    }
}
