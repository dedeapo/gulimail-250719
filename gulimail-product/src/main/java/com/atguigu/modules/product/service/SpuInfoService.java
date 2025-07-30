package com.atguigu.modules.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.modules.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author lfy
 * @email lfy@gmail.com
 * @date 2025-07-29 14:13:49
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

