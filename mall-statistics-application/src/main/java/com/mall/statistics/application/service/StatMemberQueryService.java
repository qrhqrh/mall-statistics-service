package com.mall.statistics.application.service;

import com.mall.statistics.application.dto.StatMemberDto;
import com.mall.statistics.application.port.in.StatMemberQueryUseCase;
import com.mall.statistics.application.port.out.StatisticsRepository;
import com.mall.statistics.application.query.StatMemberQuery;
import com.mall.statistics.domain.entity.StatMember;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author qiu
 * @date 2025/8/18
 * @description 会员统计数据的查询实现
 */
@Service
@RequiredArgsConstructor
public class StatMemberQueryService implements StatMemberQueryUseCase {

    private final StatisticsRepository statisticsRepository;

    /**
     * 查询会员统计数据
     * @param query 查询条件
     * @return
     */
    @Override
    public List<StatMemberDto> queryStatMember(StatMemberQuery query) {
        List<StatMember> statMembers = statisticsRepository.findStatMember(query);
        return statMembers.stream()
                .map(this::convertToStatMemberDto)
                .collect(Collectors.toList());
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
