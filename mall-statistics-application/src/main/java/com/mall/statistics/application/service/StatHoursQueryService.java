package com.mall.statistics.application.service;

import com.mall.statistics.application.dto.StatHoursDto;
import com.mall.statistics.application.port.in.StatHoursQueryUseCase;
import com.mall.statistics.application.query.StatHoursQuery;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author qiu
 * @date 2025/8/18
 * @description 小时统计数据的查询实现
 */
@Service
public class StatHoursQueryService implements StatHoursQueryUseCase {

    /**
     * 查询小时统计数据
     * @param query 查询条件
     * @return
     */
    @Override
    public List<StatHoursDto> queryStatHours(StatHoursQuery query) {
        return List.of();
    }
}
