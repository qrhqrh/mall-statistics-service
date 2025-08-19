package com.mall.statistics.domain.model.hours;

import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author qiu
 * @date 2025/8/19
 * @description 小时统计聚合根
 */
@Getter
public class StatHours {

    private final StatId statId;
    private final Long newGoodsCommonNum;
    private final Long newStoreNum;
    private final Amount ordersAmount;
    private final Long ordersNum;
    private final Amount predepositBalanceAmount;
    private final Amount predepositCashAmount;
    private final BigDecimal predepositConsumeNum;
    private final Amount predepositRechargeAmount;
    private final BigDecimal predepositRefundNum;
    private final Amount refundAmount;
    private final StatDate statDate;
    private final Hour statHour;
    private final LocalDateTime createdAt;
    private final Long createdBy;
    private final LocalDateTime updatedAt;
    private final Long updatedBy;
    private final boolean isDeleted;

    public StatHours(StatId statId, Long newGoodsCommonNum, Long newStoreNum, Amount ordersAmount, Long ordersNum, Amount predepositBalanceAmount, Amount predepositCashAmount, BigDecimal predepositConsumeNum, Amount predepositRechargeAmount, BigDecimal predepositRefundNum, Amount refundAmount, StatDate statDate, Hour statHour, LocalDateTime createdAt, Long createdBy, LocalDateTime updatedAt, Long updatedBy, boolean isDeleted){

        this.statId = statId;
        this.newGoodsCommonNum = newGoodsCommonNum;
        this.newStoreNum = newStoreNum;
        this.ordersAmount = ordersAmount;
        this.ordersNum = ordersNum;
        this.predepositBalanceAmount = predepositBalanceAmount;
        this.predepositCashAmount = predepositCashAmount;
        this.predepositConsumeNum = predepositConsumeNum;
        this.predepositRechargeAmount = predepositRechargeAmount;
        this.predepositRefundNum = predepositRefundNum;
        this.refundAmount = refundAmount;
        this.statDate = statDate;
        this.statHour = statHour;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
        this.isDeleted = isDeleted;
    }
}
