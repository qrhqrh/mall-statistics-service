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
 * 订单统计数据实体
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("stat_orders")
@Schema(description = "订单统计数据")
public class StatOrders extends BaseEntity {
    
    @TableId(value = "orders_id", type = IdType.AUTO)
    @Schema(description = "订单ID")
    private Long ordersId;
    
    @Schema(description = "管理员收款状态")
    private Integer adminReceivePayState;
    
    @Schema(description = "自动收货时间")
    private LocalDateTime autoReceiveTime;
    
    @Schema(description = "取消原因")
    private Integer cancelReason;
    
    @Schema(description = "取消角色")
    private String cancelRole;
    
    @Schema(description = "取消时间")
    private LocalDateTime cancelTime;
    
    @Schema(description = "佣金金额")
    private BigDecimal commissionAmount;
    
    @Schema(description = "确认价格")
    private BigDecimal conformPrice;
    
    @Schema(description = "创建时间")
    private LocalDateTime createTime;
    
    @Schema(description = "创建日期")
    private String createTimeDate;
    
    @Schema(description = "创建小时")
    private String createTimeHour;
    
    @Schema(description = "延迟收货状态")
    private Integer delayReceiveState;
    
    @Schema(description = "评价追加状态")
    private Integer evaluationAppendState;
    
    @Schema(description = "评价状态")
    private Integer evaluationState;
    
    @Schema(description = "评价时间")
    private LocalDateTime evaluationTime;
    
    @Schema(description = "完成时间")
    private LocalDateTime finishTime;
    
    @Schema(description = "运费金额")
    private BigDecimal freightAmount;
    
    @Schema(description = "团购ID")
    private Integer groupId;
    
    @Schema(description = "是否免运费")
    private Integer isFreeFreight;
    
    @Schema(description = "限制金额")
    private BigDecimal limitAmount;
    
    @Schema(description = "锁定状态")
    private Integer lockState;
    
    @Schema(description = "会员ID")
    private Integer memberId;
    
    @Schema(description = "会员名称")
    private String memberName;
    
    @Schema(description = "订单金额")
    private BigDecimal ordersAmount;
    
    @Schema(description = "订单来源")
    private String ordersFrom;
    
    @Schema(description = "订单来源1")
    private String ordersFrom1;
    
    @Schema(description = "订单编号")
    private Long ordersSn;
    
    @Schema(description = "订单状态")
    private Integer ordersState;
    
    @Schema(description = "订单类型")
    private Integer ordersType;
    
    @Schema(description = "外部订单编号")
    private String outOrdersSn;
    
    @Schema(description = "支付ID")
    private Integer payId;
    
    @Schema(description = "支付编号")
    private Long paySn;
    
    @Schema(description = "支付客户端类型")
    private String paymentClientType;
    
    @Schema(description = "支付代码")
    private String paymentCode;
    
    @Schema(description = "支付时间")
    private LocalDateTime paymentTime;
    
    @Schema(description = "支付类型代码")
    private String paymentTypeCode;
    
    @Schema(description = "预存款金额")
    private BigDecimal predepositAmount;
    
    @Schema(description = "收货地址")
    private String reciverAddress;
    
    @Schema(description = "收货区域ID1")
    private Integer receiverAreaId1;
    
    @Schema(description = "收货区域ID2")
    private Integer receiverAreaId2;
    
    @Schema(description = "收货区域ID3")
    private Integer receiverAreaId3;
    
    @Schema(description = "收货区域ID4")
    private Integer receiverAreaId4;
    
    @Schema(description = "收货区域信息")
    private String receiverAreaInfo;
    
    @Schema(description = "收货留言")
    private String receiverMessage;
    
    @Schema(description = "收货人姓名")
    private String receiverName;
    
    @Schema(description = "收货人电话")
    private String receiverPhone;
    
    @Schema(description = "退款金额")
    private BigDecimal refundAmount;
    
    @Schema(description = "退款状态")
    private Integer refundState;
    
    @Schema(description = "发货时间")
    private LocalDateTime sendTime;
    
    @Schema(description = "物流代码")
    private String shipCode;
    
    @Schema(description = "物流名称")
    private String shipName;
    
    @Schema(description = "物流备注")
    private String shipNote;
    
    @Schema(description = "物流单号")
    private String shipSn;
    
    @Schema(description = "店铺ID")
    private Integer storeId;
    
    @Schema(description = "店铺名称")
    private String storeName;
    
    @Schema(description = "模板ID")
    private Integer templateId;
    
    @Schema(description = "优惠券代码")
    private String voucherCode;
    
    @Schema(description = "优惠券价格")
    private BigDecimal voucherPrice;
}