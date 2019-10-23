package zhang.desingmode.strategy.service;

import org.springframework.stereotype.Service;

/**
 * @author zhangnianlei
 * @create 2019/9/16.
 * @description 计算打折后金额的接口
 */
public interface ICalculateService {
    /**
     * 获取用户的类型
     * @return
     */
    String getUserType();

    /**
     * 计算需要支付的金额（通过用户的类型和用户购买商品的总金额来计算）
     * @param fee 购买商品的总金额
     * @return 用户需要支付的金额
     */
    Double getFee(Double fee);
}
