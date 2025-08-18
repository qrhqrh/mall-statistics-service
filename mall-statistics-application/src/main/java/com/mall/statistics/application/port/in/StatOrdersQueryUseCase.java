package com.mall.statistics.application.port.in;

import com.mall.statistics.application.dto.StatOrdersDto;

import java.util.List;

/*
 * 查询订单统计数据
 */
public interface StatOrdersQueryUseCase {
    /**
     * 查询订单统计数据
     * @param query 查询条件
     * @return 统计数据列表
     */
    List<StatOrdersDto> queryStatOrders(com.mall.statistics.application.query.StatOrdersQuery query);

}
