package com.mall.statistics.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 会员统计数据实体
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("stat_member")
@Schema(description = "会员统计数据")
public class StatMember extends BaseEntity {
    
    @TableId(value = "stat_id", type = IdType.AUTO)
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