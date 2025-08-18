package com.mall.statistics.application.port.in;

import com.mall.statistics.application.dto.StatHoursDto;
import com.mall.statistics.application.query.StatHoursQuery;

import java.util.List;

/*
 * 查询小时统计数据
 */
public interface StatHoursQueryUseCase {
    /**
     * 查询小时统计数据
     * @param query 查询条件
     * @return 统计数据列表
     */
    List<StatHoursDto> queryStatHours(StatHoursQuery query);

}
