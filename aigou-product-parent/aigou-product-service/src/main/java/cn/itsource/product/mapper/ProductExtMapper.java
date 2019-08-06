package cn.itsource.product.mapper;

import cn.itsource.product.domain.ProductExt;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 商品扩展 Mapper 接口
 * </p>
 *
 */
@Component
public interface ProductExtMapper extends BaseMapper<ProductExt> {

    void updateViewProperties(@Param("productId") long productId, @Param("viewProperties") String viewProperties);
}
