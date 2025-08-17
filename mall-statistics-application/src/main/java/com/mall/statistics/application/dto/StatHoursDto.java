package com.mall.statistics.application.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 小时统计数据DTO
 */
@Data
@Schema(description = "小时统计数据")
public class StatHoursDto {
    
    @Schema(description = "统计ID")
    private Long statId;
    
    @Schema(description = "新增商品数量")
    private Long newGoodsCommonNum;
    
    @Schema(description = "新增会员数量")
    private Long newMemberNum;
    
    @Schema(description = "新增店铺数量")
    private Long newStoreNum;
    
    @Schema(description = "订单金额")
    private BigDecimal ordersAmount;
    
    @Schema(description = "订单数量")
    private Long ordersNum;
    
    @Schema(description = "预存款余额")
    private BigDecimal predepositBalanceAmount;
    
    @Schema(description = "预存款现金金额")
    private BigDecimal predepositCashAmount;
    
    @Schema(description = "预存款消费金额")
    private BigDecimal predepositConsumeAmount;
    
    @Schema(description = "预存款充值金额")
    private BigDecimal predepositRechargeAmount;
    
    @Schema(description = "预存款退款金额")
    private BigDecimal predepositRefundAmount;
    
    @Schema(description = "退款金额")
    private BigDecimal refundAmount;
    
    @Schema(description = "统计日期")
    private LocalDateTime statDate;
    
    @Schema(description = "统计小时")
    private Integer statHour;
}