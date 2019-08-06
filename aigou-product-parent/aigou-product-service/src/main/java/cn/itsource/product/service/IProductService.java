package cn.itsource.product.service;

import cn.itsource.basic.util.PageList;
import cn.itsource.product.domain.Product;
import cn.itsource.product.domain.Specification;
import cn.itsource.product.query.ProductQuery;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 商品 服务类
 * </p>
 *
 */
public interface IProductService extends IService<Product> {

    PageList<Product> queryPage(ProductQuery query);


    List<Specification> getViewProperties(Long productId);

    void updateViewProperties(long productId, String viewProperties);

    List<Specification> getSkuProperties(Long productId);
}
