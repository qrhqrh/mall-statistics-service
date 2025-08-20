package com.mall.statistics.domain.model.member;

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
public class StatMember {

    private final Long statId;
    private final MemberId memberId;
    private final MemberName memberName;
    private final Amount ordersAmount;
    private final Count orderNum;
    private final Point pointsIncrease;
    private final Point pointsReduce;
    private final Amount predepositIncrease;
    private final Amount predepositReduce;
    private final StatDate statDate;
    private final LocalDateTime createdAt;
    private final Long createdBy;
    private final LocalDateTime updatedAt;
    private final Long updatedBy;
    private final boolean isDeleted;

    public StatMember(Long statId, MemberId memberId, MemberName memberName, Amount ordersAmount, Count orderNum, Point pointsIncrease, Point pointsReduce, Amount predepositIncrease, Amount predepositReduce, StatDate statDate, LocalDateTime createdAt, Long createdBy, LocalDateTime updatedAt, Long updatedBy, boolean isDeleted) {
        this.statId = statId;
        this.memberId = memberId;
        this.memberName = memberName;
        this.ordersAmount = ordersAmount;
        this.orderNum = orderNum;
        this.pointsIncrease = pointsIncrease;
        this.pointsReduce = pointsReduce;
        this.predepositIncrease = predepositIncrease;
        this.predepositReduce = predepositReduce;
        this.statDate = statDate;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
        this.isDeleted = isDeleted;
    }
}
