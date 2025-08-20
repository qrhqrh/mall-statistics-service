package com.mall.statistics.domain.model.orders;

import com.mall.statistics.domain.model.hours.Amount;
import com.mall.statistics.domain.model.hours.StatDate;
import lombok.Getter;
import java.time.LocalDateTime;

/**
 * @author qiu
 * @date 2025/8/20
 * @description
 */
@Getter
public class StatOrders {

    private final Long orderId;
    private final Integer adminReceivePayState;
    private final StatDate autoReceiveTime;
    private final Integer cancelReason;
    private final String cancelRole;
    private final StatDate cancelTime;
    private final Amount commissionAmount;
    private final Amount conformPrice;
    private final StatDate createTime;
    private final String createTimeDate;
    private final String createTimeHour;
    private final Integer delayReceiveState;
    private final Integer evaluationAppendState;
    private final Integer evaluationState;
    private final StatDate evaluationTime;
    private final StatDate finishTime;
    private final Amount freightAmount;
    private final Integer groupId;
    private final Integer isFreeFreight;
    private final Amount limitAmount;
    private final Integer lockState;
    private final Integer memberId;
    private final String memberName;
    private final Amount ordersAmount;
    private final String ordersFrom;
    private final String ordersFrom1;
    private final Long ordersSn;
    private final Integer ordersState;
    private final Integer ordersType;
    private final String outOrdersSn;
    private final Integer payId;
    private final Long paySn;
    private final String paymentClientType;
    private final String paymentCode;
    private final StatDate paymentTime;
    private final String paymentTypeCode;
    private final Amount predepositAmount;
    private final Address reciverAddress;
    private final Address receiverAreaId1;
    private final Address receiverAreaId2;
    private final Address receiverAreaId3;
    private final Address receiverAreaId4;
    private final Address receiverAreaInfo;
    private final Address receiverMessage;
    private final Address receiverName;
    private final String receiverPhone;
    private final Amount refundAmount;
    private final Integer refundState;
    private final StatDate sendTime;
    private final String shipCode;
    private final String shipName;
    private final String shipNote;
    private final String shipSn;
    private final Integer storeId;
    private final String storeName;
    private final Integer templateId;
    private final String voucherCode;
    private final Amount voucherPrice;
    private final LocalDateTime createdAt;
    private final Long createdBy;
    private final LocalDateTime updatedAt;
    private final Long updatedBy;
    private final boolean isDeleted;


    public StatOrders(Long orderId, Integer adminReceivePayState, StatDate autoReceiveTime, Integer cancelReason, String cancelRole, StatDate cancelTime, Amount commissionAmount, Amount conformPrice, StatDate createTime, String createTimeDate, String createTimeHour, Integer delayReceiveState, Integer evaluationAppendState, Integer evaluationState, StatDate evaluationTime, StatDate finishTime, Amount freightAmount, Integer groupId, Integer isFreeFreight, Amount limitAmount, Integer lockState, Integer memberId, String memberName, Amount ordersAmount, String ordersFrom, String ordersFrom1, Long ordersSn, Integer ordersState, Integer ordersType, String outOrdersSn, Integer payId, Long paySn, String paymentClientType, String paymentCode, StatDate paymentTime, String paymentTypeCode, Amount predepositAmount, Address reciverAddress, Address receiverAreaId1, Address receiverAreaId2, Address receiverAreaId3, Address receiverAreaId4, Address receiverAreaInfo, Address receiverMessage, Address receiverName, String receiverPhone, Amount refundAmount, Integer refundState, StatDate sendTime, String shipCode, String shipName, String shipNote, String shipSn, Integer storeId, String storeName, Integer templateId, String voucherCode, Amount voucherPrice, LocalDateTime createdAt, Long createdBy, LocalDateTime updatedAt, Long updatedBy, boolean isDeleted) {
        this.orderId = orderId;
        this.adminReceivePayState = adminReceivePayState;
        this.autoReceiveTime = autoReceiveTime;
        this.cancelReason = cancelReason;
        this.cancelRole = cancelRole;
        this.cancelTime = cancelTime;
        this.commissionAmount = commissionAmount;
        this.conformPrice = conformPrice;
        this.createTime = createTime;
        this.createTimeDate = createTimeDate;
        this.createTimeHour = createTimeHour;
        this.delayReceiveState = delayReceiveState;
        this.evaluationAppendState = evaluationAppendState;
        this.evaluationState = evaluationState;
        this.evaluationTime = evaluationTime;
        this.finishTime = finishTime;
        this.freightAmount = freightAmount;
        this.groupId = groupId;
        this.isFreeFreight = isFreeFreight;
        this.limitAmount = limitAmount;
        this.lockState = lockState;
        this.memberId = memberId;
        this.memberName = memberName;
        this.ordersAmount = ordersAmount;
        this.ordersFrom = ordersFrom;
        this.ordersFrom1 = ordersFrom1;
        this.ordersSn = ordersSn;
        this.ordersState = ordersState;
        this.ordersType = ordersType;
        this.outOrdersSn = outOrdersSn;
        this.payId = payId;
        this.paySn = paySn;
        this.paymentClientType = paymentClientType;
        this.paymentCode = paymentCode;
        this.paymentTime = paymentTime;
        this.paymentTypeCode = paymentTypeCode;
        this.predepositAmount = predepositAmount;
        this.reciverAddress = reciverAddress;
        this.receiverAreaId1 = receiverAreaId1;
        this.receiverAreaId2 = receiverAreaId2;
        this.receiverAreaId3 = receiverAreaId3;
        this.receiverAreaId4 = receiverAreaId4;
        this.receiverAreaInfo = receiverAreaInfo;
        this.receiverMessage = receiverMessage;
        this.receiverName = receiverName;
        this.receiverPhone = receiverPhone;
        this.refundAmount = refundAmount;
        this.refundState = refundState;
        this.sendTime = sendTime;
        this.shipCode = shipCode;
        this.shipName = shipName;
        this.shipNote = shipNote;
        this.shipSn = shipSn;
        this.storeId = storeId;
        this.storeName = storeName;
        this.templateId = templateId;
        this.voucherCode = voucherCode;
        this.voucherPrice = voucherPrice;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
        this.isDeleted = isDeleted;
    }

}
