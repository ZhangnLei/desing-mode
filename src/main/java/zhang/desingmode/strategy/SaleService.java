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
     * 将所有实现Calculate接口的service都存放到hashmap中
     * @param calculateServices
     */
    @Autowired
    public SaleService(List<ICalculateService> calculateServices){
        calculateServices.forEach(n -> {
            calculateServiceMaps.put(n.getUserType(), n);
        });
    }

//    @Autowired //这种注入方式已实现类的bean name（默认首字母小写service名，或使用@Service（“servicename”）重命名）
//    Map<String, ICalculateService> map;

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
