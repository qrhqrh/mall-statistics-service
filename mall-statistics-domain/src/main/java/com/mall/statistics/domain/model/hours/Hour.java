package com.mall.statistics.domain.model.hours;

import com.mall.statistics.common.exception.BusinessException;

/**
 * @author qiu
 * @date 2025/8/19
 * @description
 */
public record Hour (int value){

    public Hour{
        if(value < 0 || value > 23){
            throw new BusinessException("小时值必须在0-23之间");
        }
    }

    @Override
    public String toString(){
        return String.format("%02d", value);
    }
}
