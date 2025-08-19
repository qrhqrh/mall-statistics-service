package com.mall.statistics.domain.model.hours;

import lombok.Value;

/**
 * @author qiu
 * @date 2025/8/19
 * @description
 */
@Value
public class StatId {
    Long value;

    public StatId (Long value) {
        this.value = value;
    }

    public static StatId of(Long value) {
        return new StatId(value);
    }

    public static StatId generate() {
        // 在实际应用中，这里可能需要使用雪花算法或其他ID生成策略
        // 这里简化处理，返回null，让数据库自动生成
        return new StatId(null);
    }

    public Long getValue() {
        return value;
    }
}
