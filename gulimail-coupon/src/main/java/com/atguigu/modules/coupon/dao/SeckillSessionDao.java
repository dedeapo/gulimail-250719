package com.atguigu.modules.coupon.dao;

import com.atguigu.modules.coupon.entity.SeckillSessionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 * 
 * @author lfy
 * @email lfy@gmail.com
 * @date 2025-07-31 13:57:33
 */
@Mapper
public interface SeckillSessionDao extends BaseMapper<SeckillSessionEntity> {
	
}
