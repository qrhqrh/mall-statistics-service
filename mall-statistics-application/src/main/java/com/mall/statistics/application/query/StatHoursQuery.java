package com.mall.statistics.application.query;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * 小时统计查询条件
 */
@Data
public class StatHoursQuery {
    
    /**
     * 开始日期
     */
    private LocalDateTime startDate;
    
    /**
     * 结束日期
     */
    private LocalDateTime endDate;
    
    /**
     * 统计小时
     */
    private Integer statHour;
    
    /**
     * 页码
     */
    private Integer pageNum = 1;
    
    /**
     * 页大小
     */
    private Integer pageSize = 10;
}