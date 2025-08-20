package com.mall.statistics.domain.model.member;

import com.mall.statistics.common.exception.BusinessException;

/**
 * @author qiu
 * @date 2025/8/20
 * @description
 */
public record MemberName(String value) {
    public MemberName {
        if (value == null || value.isBlank()) {
            throw new BusinessException("会员名称不能为空");
        }
        if (value.length() > 20) {
            throw new BusinessException("会员名称长度不能超过20个字符");
        }
    }

    public static MemberName of(String value) {
        String trimmed = value == null ? null : value.trim();
        return new MemberName(value);
    }
}
