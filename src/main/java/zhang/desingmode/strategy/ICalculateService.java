package zhang.desingmode.strategy;

import org.springframework.stereotype.Service;

/**
 * @author zhangnianlei
 * @create 2019/9/16.
 * @description 计算打折后金额的接口
 */
//@Service
public interface ICalculateService {
    String getUserType();
    Double getFee(String userType, Double fee);
}
