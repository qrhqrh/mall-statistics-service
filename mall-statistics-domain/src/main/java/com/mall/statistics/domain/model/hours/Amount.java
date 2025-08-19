package com.mall.statistics.domain.model.hours;

import java.math.BigDecimal;

/**
 * @author qiu
 * @date 2025/8/19
 * @description 后缀为amount的金额相关值对象
 */
public record Amount (BigDecimal value){

    public Amount{
        if(value.compareTo(BigDecimal.ZERO) < 0){
            throw new IllegalArgumentException("金额不能为负数");
        }
    }

    /**
     * 当前金额发生新增事件后返回新的Amount对象
     * @param amount
     * @return
     */
    public Amount add(Amount amount){
        return new Amount(this.value.add(amount.value));
    }
}
