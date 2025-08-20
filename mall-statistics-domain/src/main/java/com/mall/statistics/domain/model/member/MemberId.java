package com.mall.statistics.domain.model.member;

import com.mall.statistics.common.exception.BusinessException;

/**
 * @author qiu
 * @date 2025/8/20
 * @description
 */
public record MemberId (Long value){
    public MemberId {
        if(value == null || value <= 0){
            throw new BusinessException("会员id必须是正整数");
        }
    }

    public static MemberId generate() {
        // 在实际应用中，这里可能需要使用雪花算法或其他ID生成策略
        // 这里简化处理，返回null，让数据库自动生成
        return new MemberId(null);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
