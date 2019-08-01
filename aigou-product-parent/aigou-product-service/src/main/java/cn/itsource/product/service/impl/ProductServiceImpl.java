package cn.itsource.product.service.impl;

import cn.itsource.product.domain.Product;
import cn.itsource.product.mapper.ProductMapper;
import cn.itsource.product.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品 服务实现类
 * </p>
 *
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
