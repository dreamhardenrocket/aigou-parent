package cn.itsource.product.service.impl;

import cn.itsource.product.domain.Sku;
import cn.itsource.product.mapper.SkuMapper;
import cn.itsource.product.service.ISkuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * SKU 服务实现类
 * </p>
 *
 */
@Service
public class SkuServiceImpl extends ServiceImpl<SkuMapper, Sku> implements ISkuService {

}
