package com.mall.statistics.application.port.in;

import com.mall.statistics.application.dto.StatHoursDto;
import com.mall.statistics.application.dto.StatMemberDto;
import com.mall.statistics.application.dto.StatOrdersDto;
import com.mall.statistics.application.query.StatHoursQuery;
import com.mall.statistics.application.query.StatMemberQuery;
import com.mall.statistics.application.query.StatOrdersQuery;

import java.util.List;

/**
 * 统计查询用例接口
 */
public interface StatisticsQueryUseCase {
    
    /**
     * 查询小时统计数据
     * @param query 查询条件
     * @return 统计数据列表
     */
    List<StatHoursDto> queryStatHours(StatHoursQuery query);
    
    /**
     * 查询订单统计数据
     * @param query 查询条件
     * @return 统计数据列表
     */
    List<StatOrdersDto> queryStatOrders(StatOrdersQuery query);
    
    /**
     * 查询会员统计数据
     * @param query 查询条件
     * @return 统计数据列表
     */
    List<StatMemberDto> queryStatMember(StatMemberQuery query);
}