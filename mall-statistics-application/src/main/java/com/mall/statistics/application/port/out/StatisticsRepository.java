package com.mall.statistics.application.port.out;

import com.mall.statistics.domain.entity.StatHours;
import com.mall.statistics.domain.entity.StatMember;
import com.mall.statistics.domain.entity.StatOrders;
import com.mall.statistics.application.query.StatHoursQuery;
import com.mall.statistics.application.query.StatMemberQuery;
import com.mall.statistics.application.query.StatOrdersQuery;

import java.util.List;

/**
 * 统计数据仓储接口
 */
public interface StatisticsRepository {
    
    /**
     * 查询小时统计数据
     * @param query 查询条件
     * @return 统计数据列表
     */
    List<StatHours> findStatHours(StatHoursQuery query);
    
    /**
     * 查询订单统计数据
     * @param query 查询条件
     * @return 统计数据列表
     */
    List<StatOrders> findStatOrders(StatOrdersQuery query);
    
    /**
     * 查询会员统计数据
     * @param query 查询条件
     * @return 统计数据列表
     */
    List<StatMember> findStatMember(StatMemberQuery query);
}