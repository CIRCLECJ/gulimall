package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author yjh
 * @email y1291249384@gmail.com
 * @date 2021-12-22 20:52:59
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
