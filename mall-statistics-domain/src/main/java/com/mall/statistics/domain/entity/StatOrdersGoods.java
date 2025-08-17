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
 * 订单商品统计数据实体
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("stat_orders_goods")
@Schema(description = "订单商品统计数据")
public class StatOrdersGoods extends BaseEntity {
    
    @TableId(value = "orders_goods_id", type = IdType.AUTO)
    @Schema(description = "订单商品ID")
    private Long ordersGoodsId;
    
    @Schema(description = "基础价格")
    private BigDecimal basePrice;
    
    @Schema(description = "捆绑ID")
    private Integer bundlingId;
    
    @Schema(description = "购买数量")
    private Integer buyNum;
    
    @Schema(description = "分类ID")
    private Integer categoryId;
    
    @Schema(description = "一级分类ID")
    private Integer categoryId1;
    
    @Schema(description = "二级分类ID")
    private Integer categoryId2;
    
    @Schema(description = "三级分类ID")
    private Integer categoryId3;
    
    @Schema(description = "佣金比例")
    private Integer commissionRate;
    
    @Schema(description = "通用ID")
    private Integer commonId;
    
    @Schema(description = "创建时间")
    private LocalDateTime createTime;
    
    @Schema(description = "创建日期")
    private LocalDateTime createTimeDate;
    
    @Schema(description = "创建小时")
    private Integer createTimeHour;
    
    @Schema(description = "商品完整规格")
    private String goodsFullSpecs;
    
    @Schema(description = "商品ID")
    private Integer goodsId;
    
    @Schema(description = "商品图片")
    private String goodsImage;
    
    @Schema(description = "商品名称")
    private String goodsName;
    
    @Schema(description = "商品支付金额")
    private BigDecimal goodsPayAmount;
    
    @Schema(description = "商品价格")
    private BigDecimal goodsPrice;
    
    @Schema(description = "商品类型")
    private Integer goodsType;
    
    @Schema(description = "会员ID")
    private Integer memberId;
    
    @Schema(description = "会员名称")
    private String memberName;
    
    @Schema(description = "订单ID")
    private Integer ordersId;
    
    @Schema(description = "促销标题")
    private String promotionTitle;
    
    @Schema(description = "店铺ID")
    private Integer storeId;
    
    @Schema(description = "店铺名称")
    private String storeName;
    
    @Schema(description = "单位名称")
    private String unitName;
}