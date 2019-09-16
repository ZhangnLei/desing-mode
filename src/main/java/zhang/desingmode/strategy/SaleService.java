package zhang.desingmode.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @author zhangnianlei
 * @create 2019/9/16.
 * @description 出售商品时计算金额
 */
@Service
public class SaleService {

    HashMap<String, ICalculateService> calculateServiceMaps = new HashMap<>();

    /**
     *     这种注入方式的生成的map，map的key是bean name,value是bean
     *     @Autowired
     *     Map<String ,  I CalculateService> map;
     */

    /**
     * 将所有实现Calculate接口的service都存放到hashmap中
     * @Autowired List<ICalculateService> calculateServices 使用spring注入的高级功能,将ICalculateService的实现类全部注入到
     * @param calculateServices
     */
    @Autowired
    public SaleService(List<ICalculateService> calculateServices){
        //kay是userType，value是bean
        calculateServices.forEach(n -> calculateServiceMaps.put(n.getUserType(), n));
    }

    /**
     * 根据用户类型和总金额来返回打折后的金额
     * @param userType
     * @param fee
     * @return
     */
    public Double sale(String userType, Double fee){
        ICalculateService calculateService = calculateServiceMaps.get(userType);
        if (calculateService == null) {
            return fee;
        }
        return calculateService.getFee(userType, fee);
    }
}
