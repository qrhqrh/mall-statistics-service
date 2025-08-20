package com.mall.statistics.domain.model.member;

import com.mall.statistics.common.exception.BusinessException;

/**
 * @author qiu
 * @date 2025/8/20
 * @description
 */
public record Count (Long value){
    public Count {
        if(value == null || value < 0) {
            throw new BusinessException("数量不能为负数");
        }
    }

    /**
     * 增加值
     * @param countAdd
     * @return
     */
    public Count increment(long countAdd){
        if(countAdd < 0){
            throw new BusinessException("增加数不能小于0");
        }
        return new Count(this.value + countAdd);
    }

    /**
     * 减少值
     * @param countReduce
     * @return
     */
    public Count decrement(long countReduce){
        if(countReduce < 0){
            throw new BusinessException("减少数不能小于0");
        }
        long newCount = this.value - countReduce;
        if(newCount < 0){
            throw new BusinessException("减少数不能大于当前值");
        }
        return new Count(newCount);
    }
}
