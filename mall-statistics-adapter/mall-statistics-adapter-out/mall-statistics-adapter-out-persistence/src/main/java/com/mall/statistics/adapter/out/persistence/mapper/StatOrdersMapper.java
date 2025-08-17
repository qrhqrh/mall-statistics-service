package com.mall.statistics.adapter.out.persistence.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mall.statistics.domain.entity.StatOrders;
import com.mall.statistics.application.query.StatOrdersQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 订单统计数据Mapper
 */
@Mapper
public interface StatOrdersMapper extends BaseMapper<StatOrders> {
    
    /**
     * 根据查询条件查询订单统计数据
     * @param query 查询条件
     * @return 统计数据列表
     */
    List<StatOrders> selectByQuery(@Param("query") StatOrdersQuery query);
}