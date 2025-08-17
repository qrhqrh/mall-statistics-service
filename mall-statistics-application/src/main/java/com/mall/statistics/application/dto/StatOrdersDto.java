package com.mall.statistics.application.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 订单统计数据DTO
 */
@Data
@Schema(description = "订单统计数据")
public class StatOrdersDto {
    
    @Schema(description = "订单ID")
    private Long ordersId;
    
    @Schema(description = "会员ID")
    private Integer memberId;
    
    @Schema(description = "会员名称")
    private String memberName;
    
    @Schema(description = "订单金额")
    private BigDecimal ordersAmount;
    
    @Schema(description = "订单编号")
    private Long ordersSn;
    
    @Schema(description = "订单状态")
    private Integer ordersState;
    
    @Schema(description = "订单类型")
    private Integer ordersType;
    
    @Schema(description = "店铺ID")
    private Integer storeId;
    
    @Schema(description = "店铺名称")
    private String storeName;
    
    @Schema(description = "创建时间")
    private LocalDateTime createTime;
    
    @Schema(description = "支付时间")
    private LocalDateTime paymentTime;
    
    @Schema(description = "完成时间")
    private LocalDateTime finishTime;
}