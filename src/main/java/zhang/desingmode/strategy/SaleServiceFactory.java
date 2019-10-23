package zhang.desingmode.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zhang.desingmode.strategy.service.ICalculateService;

import java.util.HashMap;
import java.util.List;

/**
 * @author zhangnianlei
 * @create 2019/9/16.
 * @description 出售商品时计算金额
 */
@Service
public class SaleServiceFactory {

    static HashMap<String, ICalculateService> calculateServiceMaps = new HashMap<>();

    /**
     *     这种注入方式的生成的map，map的key是bean name,value是bean
     *     @Autowired
     *     Map<String ,  I CalculateService> map;
     */

    /**
     * 将所有实现Calculate接口的service都存放到hashmap中
     * kay是userType，value是bean对象
     * @Autowired List<ICalculateService> calculateServices 使用spring注入的高级功能,将ICalculateService的实现类全部注入到list中
     * @param calculateServices
     */
    @Autowired
    public SaleServiceFactory(List<ICalculateService> calculateServices){
        calculateServices.forEach(n -> calculateServiceMaps.put(n.getUserType(), n));
    }

    public static ICalculateService getByTypes(String type) {
        return calculateServiceMaps.get(type) == null ? calculateServiceMaps.get("normal") : calculateServiceMaps.get(type);
    }

}
