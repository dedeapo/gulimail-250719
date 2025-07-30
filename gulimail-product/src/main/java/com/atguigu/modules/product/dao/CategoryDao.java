package com.atguigu.modules.product.dao;

import com.atguigu.modules.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author lfy
 * @email lfy@gmail.com
 * @date 2025-07-29 14:13:49
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
