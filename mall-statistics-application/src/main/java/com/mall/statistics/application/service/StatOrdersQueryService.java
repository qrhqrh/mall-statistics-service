package com.mall.statistics.application.service;

import com.mall.statistics.application.dto.StatOrdersDto;
import com.mall.statistics.application.port.in.StatOrdersQueryUseCase;
import com.mall.statistics.application.query.StatOrdersQuery;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 订单统计数据的查询实现
 * 负责订单统计数据的查询操作
 */
@Service
public class StatOrdersQueryService implements StatOrdersQueryUseCase {

    @Override
    public List<StatOrdersDto> queryStatOrders(StatOrdersQuery query) {
        return List.of();
    }
}
