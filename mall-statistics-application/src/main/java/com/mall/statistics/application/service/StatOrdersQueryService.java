package com.mall.statistics.application.service;

import com.mall.statistics.application.dto.StatOrdersDto;
import com.mall.statistics.application.port.in.StatOrdersQueryUseCase;
import com.mall.statistics.application.port.out.StatisticsRepository;
import com.mall.statistics.application.query.StatOrdersQuery;
import com.mall.statistics.domain.entity.StatOrders;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author qiu
 * @date 2025/8/18
 * @description 订单统计数据的查询实现
 */
@Service
@RequiredArgsConstructor
public class StatOrdersQueryService implements StatOrdersQueryUseCase {

    private final StatisticsRepository statisticsRepository;

    /**
     * 查询订单统计数据
     * @param query 查询条件
     * @return
     */
    @Override
    public List<StatOrdersDto> queryStatOrders(StatOrdersQuery query) {
        List<StatOrders> statOrders = statisticsRepository.findStatOrders(query);
        return statOrders.stream()
                .map(this::convertToStatOrdersDto)
                .collect(Collectors.toList());
    }

    /**
     * 转换StatOrders实体为DTO
     */
    private StatOrdersDto convertToStatOrdersDto(StatOrders statOrders) {
        StatOrdersDto dto = new StatOrdersDto();
        dto.setOrdersId(statOrders.getOrdersId());
        dto.setMemberId(statOrders.getMemberId());
        dto.setMemberName(statOrders.getMemberName());
        dto.setOrdersAmount(statOrders.getOrdersAmount());
        dto.setOrdersSn(statOrders.getOrdersSn());
        dto.setOrdersState(statOrders.getOrdersState());
        dto.setOrdersType(statOrders.getOrdersType());
        dto.setStoreId(statOrders.getStoreId());
        dto.setStoreName(statOrders.getStoreName());
        dto.setCreateTime(statOrders.getCreateTime());
        dto.setPaymentTime(statOrders.getPaymentTime());
        dto.setFinishTime(statOrders.getFinishTime());
        return dto;
    }
}
