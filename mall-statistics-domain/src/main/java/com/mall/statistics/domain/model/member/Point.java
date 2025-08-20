package com.mall.statistics.domain.model.member;

import com.mall.statistics.common.exception.BusinessException;

/**
 * @author qiu
 * @date 2025/8/20
 * @description
 */
public record Point (Long value){
    public Point {
        if(value == null || value < 0) {
            throw new BusinessException("积分不能为负数");
        }
    }

    /**
     * 增加值
     * @param pointAdd
     * @return
     */
    public Point increment(long pointAdd){
        if(pointAdd < 0){
            throw new BusinessException("积分增加量不能小于0");
        }
        return new Point(this.value + pointAdd);
    }

    /**
     * 减少值
     * @param pointReduce
     * @return
     */
    public Point decrement(long pointReduce){
        if(pointReduce < 0){
            throw new BusinessException("积分使用量不能小于0");
        }
        long newPoint = this.value - pointReduce;
        if(newPoint < 0){
            throw new BusinessException("当前积分不足");
        }
        return new Point(newPoint);
    }
}
