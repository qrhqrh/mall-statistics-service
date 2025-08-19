package com.mall.statistics.application.service;

import com.mall.statistics.application.dto.StatHoursDto;
import com.mall.statistics.application.port.in.StatHoursQueryUseCase;
import com.mall.statistics.application.port.out.StatisticsRepository;
import com.mall.statistics.application.query.StatHoursQuery;
import com.mall.statistics.domain.entity.StatHours;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author qiu
 * @date 2025/8/18
 * @description 小时统计数据的查询实现
 */
@Service
@RequiredArgsConstructor
public class StatHoursQueryService implements StatHoursQueryUseCase {

    private final StatisticsRepository statisticsRepository;

    /**
     * 查询小时统计数据
     * @param query 查询条件
     * @return
     */
    @Override
    public List<StatHoursDto> queryStatHours(StatHoursQuery query) {
        List<StatHours> statHours = statisticsRepository.findStatHours(query);
        return statHours.stream()
                .map(this::convertToStatHoursDto)
                .collect(Collectors.toList());
    }

    /**
     * 转换StatHours实体为DTO
     */
    private StatHoursDto convertToStatHoursDto(StatHours statHours) {
        StatHoursDto dto = new StatHoursDto();
        dto.setStatId(statHours.getStatId());
        dto.setNewGoodsCommonNum(statHours.getNewGoodsCommonNum());
        dto.setNewMemberNum(statHours.getNewMemberNum());
        dto.setNewStoreNum(statHours.getNewStoreNum());
        dto.setOrdersAmount(statHours.getOrdersAmount());
        dto.setOrdersNum(statHours.getOrdersNum());
        dto.setPredepositBalanceAmount(statHours.getPredepositBalanceAmount());
        dto.setPredepositCashAmount(statHours.getPredepositCashAmount());
        dto.setPredepositConsumeAmount(statHours.getPredepositConsumeAmount());
        dto.setPredepositRechargeAmount(statHours.getPredepositRechargeAmount());
        dto.setPredepositRefundAmount(statHours.getPredepositRefundAmount());
        dto.setRefundAmount(statHours.getRefundAmount());
        dto.setStatDate(statHours.getStatDate());
        dto.setStatHour(statHours.getStatHour());
        return dto;
    }
}
