package cn.itsource.product.mapper;

import cn.itsource.product.domain.Brand;
import cn.itsource.product.query.BrandQuery;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 品牌信息 Mapper 接口
 * </p>
 */
@Component
public interface BrandMapper extends BaseMapper<Brand> {

    /**
     * 分页条件查询
     * @param page
     * @param query
     * @return
     */
    IPage<Brand> queryPage(Page page, @Param("query") BrandQuery query);
}
