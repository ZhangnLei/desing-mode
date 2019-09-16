package zhang.desingmode;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import zhang.desingmode.observer.OrderService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DesingModeApplicationTests {

    @Autowired
    private OrderService orderService;
    @Test
    public void contextLoads() {
        orderService.saveOrder();
    }

}