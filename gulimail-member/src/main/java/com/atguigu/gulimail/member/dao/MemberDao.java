package com.atguigu.gulimail.member.dao;

import com.atguigu.gulimail.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lfy
 * @email lfy@gmail.com
 * @date 2025-07-31 16:03:57
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
