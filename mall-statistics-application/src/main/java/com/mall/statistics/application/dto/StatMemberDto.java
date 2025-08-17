package com.mall.statistics.application.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 会员统计数据DTO
 */
@Data
@Schema(description = "会员统计数据")
public class StatMemberDto {
    
    @Schema(description = "统计ID")
    private Long statId;
    
    @Schema(description = "会员ID")
    private Integer memberId;
    
    @Schema(description = "会员名称")
    private String memberName;
    
    @Schema(description = "订单金额")
    private BigDecimal ordersAmount;
    
    @Schema(description = "订单数量")
    private Long ordersNum;
    
    @Schema(description = "积分增加")
    private Long pointsIncrease;
    
    @Schema(description = "积分减少")
    private Long pointsReduce;
    
    @Schema(description = "预存款增加")
    private BigDecimal predepositIncrease;
    
    @Schema(description = "预存款减少")
    private BigDecimal predepositReduce;
    
    @Schema(description = "统计日期")
    private LocalDateTime statDate;
}