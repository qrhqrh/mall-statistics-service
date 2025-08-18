package com.mall.statistics.application.service;

import com.mall.statistics.application.dto.StatOrdersDto;
import com.mall.statistics.application.port.in.StatOrdersQueryUseCase;
import com.mall.statistics.application.query.StatOrdersQuery;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author qiu
 * @date 2025/8/18
 * @description 订单统计数据的查询实现
 */
@Service
public class StatOrdersQueryService implements StatOrdersQueryUseCase {

    /**
     * 查询订单统计数据
     * @param query 查询条件
     * @return
     */
    @Override
    public List<StatOrdersDto> queryStatOrders(StatOrdersQuery query) {
        return List.of();
    }
}
