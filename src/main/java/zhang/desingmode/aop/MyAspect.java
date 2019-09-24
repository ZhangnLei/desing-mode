package zhang.desingmode.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author zhangnianlei
 * @create 2019/9/25.
 * @description
 */
@Component
@Aspect
public class MyAspect {


    @Around("@annotation(Mytransactional)")
    public void doTranactional(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("before");
        try {
            Object o = proceedingJoinPoint.proceed();
//            return o;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("error occurs");
        }
        System.out.println("after");
//        return null;
    }
}
