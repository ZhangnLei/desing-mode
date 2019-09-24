package zhang.desingmode;

import org.junit.Test;

/**
 * @author zhangnianlei
 * @create 2019/9/25.
 * @description ThreadLocal<>：针对不同的线程返回不同的值
 */
public class ThreadLocalTest {

    static ThreadLocal<String> name = new ThreadLocal<>();

    @Test
    public void getName() throws InterruptedException {
        name.set("nianlei");
        System.out.println(name.get());
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(name.get());
            }
        }).start();
    }
}
