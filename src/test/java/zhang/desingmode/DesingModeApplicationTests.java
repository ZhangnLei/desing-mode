package zhang.desingmode;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import zhang.desingmode.aop.DBOperation;
import zhang.desingmode.observer.OrderService;
import zhang.desingmode.strategy.SaleServiceFactory;
import zhang.desingmode.strategy.service.ICalculateService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DesingModeApplicationTests {

    @Autowired
    private OrderService orderService;

    @Autowired
    private SaleServiceFactory saleService;

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
    public void testSale001(){
        ICalculateService calculateService = SaleServiceFactory.getByTypes("normal");
        Double fee = calculateService.getFee(Double.valueOf(100));
        System.out.println("normal" + " sale : " + fee);

    }

    @Test
    public void testSale002(){
        ICalculateService calculateService = SaleServiceFactory.getByTypes("vip");
        Double fee = calculateService.getFee(Double.valueOf(100));
        System.out.println("vip" + " sale : " + fee);
    }

    @Test
    public void testSale003(){
        ICalculateService calculateService = SaleServiceFactory.getByTypes("svip");
        Double fee = calculateService.getFee(Double.valueOf(100));
        System.out.println("svip" + " sale : " + fee);
    }

    @Test
    public void testSale004(){
        ICalculateService calculateService = SaleServiceFactory.getByTypes("zhang");
        Double fee = calculateService.getFee(Double.valueOf(100));
        System.out.println("zhang" + " sale : " + fee);
    }

    @Autowired
    DBOperation dbOperation;
    @Test
    public void useAnnotationtest() {
        dbOperation.doSomething();
    }



}
