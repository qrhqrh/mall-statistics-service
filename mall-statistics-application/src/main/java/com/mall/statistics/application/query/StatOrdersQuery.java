package com.mall.statistics.application.query;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * 订单统计查询条件
 */
@Data
public class StatOrdersQuery {
    
    /**
     * 会员ID
     */
    private Integer memberId;
    
    /**
     * 店铺ID
     */
    private Integer storeId;
    
    /**
     * 订单状态
     */
    private Integer ordersState;
    
    /**
     * 开始时间
     */
    private LocalDateTime startTime;
    
    /**
     * 结束时间
     */
    private LocalDateTime endTime;
    
    /**
     * 页码
     */
    private Integer pageNum = 1;
    
    /**
     * 页大小
     */
    private Integer pageSize = 10;
}