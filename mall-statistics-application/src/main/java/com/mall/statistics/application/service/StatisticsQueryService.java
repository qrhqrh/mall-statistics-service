package com.mall.statistics.application.service;

import com.mall.statistics.application.dto.StatHoursDto;
import com.mall.statistics.application.dto.StatMemberDto;
import com.mall.statistics.application.dto.StatOrdersDto;
import com.mall.statistics.application.port.in.StatisticsQueryUseCase;
import com.mall.statistics.application.port.out.StatisticsRepository;
import com.mall.statistics.application.query.StatHoursQuery;
import com.mall.statistics.application.query.StatMemberQuery;
import com.mall.statistics.application.query.StatOrdersQuery;
import com.mall.statistics.domain.entity.StatHours;
import com.mall.statistics.domain.entity.StatMember;
import com.mall.statistics.domain.entity.StatOrders;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 统计查询服务实现
 */
@Service
@RequiredArgsConstructor
public class StatisticsQueryService implements StatisticsQueryUseCase {
    
    private final StatisticsRepository statisticsRepository;
    
    @Override
    public List<StatHoursDto> queryStatHours(StatHoursQuery query) {
        List<StatHours> statHours = statisticsRepository.findStatHours(query);
        return statHours.stream()
                .map(this::convertToStatHoursDto)
                .collect(Collectors.toList());
    }
    
    @Override
    public List<StatOrdersDto> queryStatOrders(StatOrdersQuery query) {
        List<StatOrders> statOrders = statisticsRepository.findStatOrders(query);
        return statOrders.stream()
                .map(this::convertToStatOrdersDto)
                .collect(Collectors.toList());
    }
    
    @Override
    public List<StatMemberDto> queryStatMember(StatMemberQuery query) {
        List<StatMember> statMembers = statisticsRepository.findStatMember(query);
        return statMembers.stream()
                .map(this::convertToStatMemberDto)
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
    
    /**
     * 转换StatMember实体为DTO
     */
    private StatMemberDto convertToStatMemberDto(StatMember statMember) {
        StatMemberDto dto = new StatMemberDto();
        dto.setStatId(statMember.getStatId());
        dto.setMemberId(statMember.getMemberId());
        dto.setMemberName(statMember.getMemberName());
        dto.setOrdersAmount(statMember.getOrdersAmount());
        dto.setOrdersNum(statMember.getOrdersNum());
        dto.setPointsIncrease(statMember.getPointsIncrease());
        dto.setPointsReduce(statMember.getPointsReduce());
        dto.setPredepositIncrease(statMember.getPredepositIncrease());
        dto.setPredepositReduce(statMember.getPredepositReduce());
        dto.setStatDate(statMember.getStatDate());
        return dto;
    }
}