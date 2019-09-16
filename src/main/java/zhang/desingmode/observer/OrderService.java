package zhang.desingmode.observer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/**
 * @author zhangnianlei
 * @create 2019/9/16.
 * @description 通过电商新订单了解观察者模式
 */
@Service
public class OrderService {

    @Autowired
    ApplicationContext applicationContext;
    public void saveOrder(){

        System.out.println("创建订单");

        //
        OrderEvent orderEvent = new OrderEvent("创建时间监听");
        applicationContext.publishEvent(orderEvent);

    }
}
