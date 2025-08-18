package com.mall.statistics.application.port.in;

import com.mall.statistics.application.dto.StatMemberDto;

import java.util.List;

/*
 * 查询会员统计数据
 */
public interface StatMemberQueryUseCase {
    /**
     * 查询会员统计数据
     * @param query 查询条件
     * @return 统计数据列表
     */
    List<StatMemberDto> queryStatMember(com.mall.statistics.application.query.StatMemberQuery query);

}
