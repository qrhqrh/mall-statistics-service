package com.mall.statistics.application.service;

import com.mall.statistics.application.dto.StatHoursDto;
import com.mall.statistics.application.port.in.StatHoursQueryUseCase;
import com.mall.statistics.application.query.StatHoursQuery;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatHoursQueryService implements StatHoursQueryUseCase {
    @Override
    public List<StatHoursDto> queryStatHours(StatHoursQuery query) {
        return List.of();
    }
}
