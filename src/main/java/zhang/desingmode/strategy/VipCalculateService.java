package zhang.desingmode.strategy;

import org.springframework.stereotype.Service;

/**
 * @author zhangnianlei
 * @create 2019/9/16.
 * @description 计算vip用户打折后金额 实现ICalculateService接口
 */
@Service
public class VipCalculateService implements ICalculateService {
    @Override
    public String getUserType() {
        return "vip";
    }

    @Override
    public Double getFee(String userType, Double fee) {
        return fee * 0.8;
    }
}
