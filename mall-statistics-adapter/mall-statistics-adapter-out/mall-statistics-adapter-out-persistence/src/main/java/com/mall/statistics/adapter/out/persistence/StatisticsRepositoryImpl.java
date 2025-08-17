package com.mall.statistics.adapter.out.persistence;

import com.mall.statistics.adapter.out.persistence.mapper.StatHoursMapper;
import com.mall.statistics.adapter.out.persistence.mapper.StatMemberMapper;
import com.mall.statistics.adapter.out.persistence.mapper.StatOrdersMapper;
import com.mall.statistics.application.port.out.StatisticsRepository;
import com.mall.statistics.application.query.StatHoursQuery;
import com.mall.statistics.application.query.StatMemberQuery;
import com.mall.statistics.application.query.StatOrdersQuery;
import com.mall.statistics.domain.entity.StatHours;
import com.mall.statistics.domain.entity.StatMember;
import com.mall.statistics.domain.entity.StatOrders;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 统计数据仓储实现
 */
@Repository
@RequiredArgsConstructor
public class StatisticsRepositoryImpl implements StatisticsRepository {
    
    private final StatHoursMapper statHoursMapper;
    private final StatOrdersMapper statOrdersMapper;
    private final StatMemberMapper statMemberMapper;
    
    @Override
    public List<StatHours> findStatHours(StatHoursQuery query) {
        return statHoursMapper.selectByQuery(query);
    }
    
    @Override
    public List<StatOrders> findStatOrders(StatOrdersQuery query) {
        return statOrdersMapper.selectByQuery(query);
    }
    
    @Override
    public List<StatMember> findStatMember(StatMemberQuery query) {
        return statMemberMapper.selectByQuery(query);
    }
}