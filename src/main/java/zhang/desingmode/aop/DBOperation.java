package zhang.desingmode.aop;

import org.springframework.stereotype.Service;

/**
 * @author zhangnianlei
 * @create 2019/9/25.
 * @description
 */
@Service
public class DBOperation {

    @Mytransactional
    public void doSomething(){
        System.out.println("do something...");
    }
}
