package zhang.desingmode.observer;

import org.springframework.context.ApplicationEvent;

/**
 * @author zhangnianlei
 * @create 2019/9/16.
 * @description 订单事件
 */
public class OrderEvent extends ApplicationEvent {
    public OrderEvent(Object source) {
        super(source);
    }

}
