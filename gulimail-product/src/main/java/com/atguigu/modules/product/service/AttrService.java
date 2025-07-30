package com.atguigu.modules.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.modules.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author lfy
 * @email lfy@gmail.com
 * @date 2025-07-29 14:13:49
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

