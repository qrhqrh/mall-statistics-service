package com.mall.statistics.application.service;

import com.mall.statistics.application.dto.StatHoursDto;
import com.mall.statistics.application.port.in.StatHoursQueryUseCase;
import com.mall.statistics.application.query.StatHoursQuery;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 小时统计数据的查询实现
 * 负责小时统计数据的查询操作
 */
@Service
public class StatHoursQueryService implements StatHoursQueryUseCase {

    @Override
    public List<StatHoursDto> queryStatHours(StatHoursQuery query) {
        return List.of();
    }
}
