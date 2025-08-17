package com.mall.statistics.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * 分类统计数据实体
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("stat_category_general")
@Schema(description = "分类统计数据")
public class StatCategoryGeneral extends BaseEntity {
    
    @TableId(value = "stat_id", type = IdType.AUTO)
    @Schema(description = "统计ID")
    private Long statId;
    
    @Schema(description = "分类ID")
    private Integer categoryId;
    
    @Schema(description = "一级分类ID")
    private Integer categoryId1;
    
    @Schema(description = "二级分类ID")
    private Integer categoryId2;
    
    @Schema(description = "三级分类ID")
    private Integer categoryId3;
    
    @Schema(description = "分类名称")
    private String categoryName;
    
    @Schema(description = "分类深度")
    private Integer deep;
    
    @Schema(description = "商品数量")
    private Long goodsCount;
    
    @Schema(description = "有订单商品数量")
    private Long haveOrdersGoodsCount;
    
    @Schema(description = "无订单商品数量")
    private Long noOrdersGoodsCount;
    
    @Schema(description = "订单金额")
    private BigDecimal ordersAmount;
    
    @Schema(description = "订单数量")
    private Long ordersNum;
}