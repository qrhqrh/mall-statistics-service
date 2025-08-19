package com.mall.statistics.domain.model.hours;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author qiu
 * @date 2025/8/19
 * @description 统计日期值对象
 */
public record StatDate(LocalDate value) {

    public StatDate {
        Objects.requireNonNull(value, "日期不能为空");
        if(value.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("日期不能大于当前日期");
        }
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
