package zhang.desingmode;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import zhang.desingmode.observer.OrderService;
import zhang.desingmode.strategy.SaleService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DesingModeApplicationTests {

    @Autowired
    private OrderService orderService;

    @Autowired
    private SaleService saleService;

    /**
     * 测试观察者模式
     */
    @Test
    public void contextLoads() {
        orderService.saveOrder();
    }

    /**
     * 测试策略模式
     */
    @Test
    public void testSale(){
        Double money = Double.valueOf(100);
        getFee("normal", money);
        getFee("vip", money);
        getFee("svip", money);
        getFee("zhang", money);

    }

    private void getFee(String userType, Double money) {
        Double fee = saleService.sale(userType, money);
        System.out.println(userType + " sale : " + fee);
    }

}
