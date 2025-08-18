package com.mall.statistics.application.service;

import com.mall.statistics.application.dto.StatMemberDto;
import com.mall.statistics.application.port.in.StatMemberQueryUseCase;
import com.mall.statistics.application.query.StatMemberQuery;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author qiu
 * @date 2025/8/18
 * @description 会员统计数据的查询实现
 */
@Service
public class StatMemberQueryService implements StatMemberQueryUseCase {

    /**
     * 查询会员统计数据
     * @param query 查询条件
     * @return
     */
    @Override
    public List<StatMemberDto> queryStatMember(StatMemberQuery query) {
        return List.of();
    }
}
