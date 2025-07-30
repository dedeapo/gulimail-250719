package com.atguigu.modules.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.modules.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author lfy
 * @email lfy@gmail.com
 * @date 2025-07-29 14:13:49
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

