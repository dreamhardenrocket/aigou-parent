package cn.itsource.product.service;

import cn.itsource.basic.util.PageList;
import cn.itsource.product.domain.Brand;
import cn.itsource.product.query.BrandQuery;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 品牌信息 服务类
 * </p>
 *
 */
public interface IBrandService extends IService<Brand> {

    /**
     * 分页查询
     * @param query
     * @return
     */
    PageList<Brand> queryPage(BrandQuery query);
}
