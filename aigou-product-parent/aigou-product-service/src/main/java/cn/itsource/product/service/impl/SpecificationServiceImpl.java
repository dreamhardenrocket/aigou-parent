package cn.itsource.product.service.impl;

import cn.itsource.product.domain.Specification;
import cn.itsource.product.mapper.SpecificationMapper;
import cn.itsource.product.service.ISpecificationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品属性 服务实现类
 * </p>
 *
 */
@Service
public class SpecificationServiceImpl extends ServiceImpl<SpecificationMapper, Specification> implements ISpecificationService {

}
