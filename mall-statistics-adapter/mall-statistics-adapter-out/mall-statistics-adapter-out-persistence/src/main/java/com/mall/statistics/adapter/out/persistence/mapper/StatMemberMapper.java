package com.mall.statistics.adapter.out.persistence.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mall.statistics.domain.entity.StatMember;
import com.mall.statistics.application.query.StatMemberQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 会员统计数据Mapper
 */
@Mapper
public interface StatMemberMapper extends BaseMapper<StatMember> {
    
    /**
     * 根据查询条件查询会员统计数据
     * @param query 查询条件
     * @return 统计数据列表
     */
    List<StatMember> selectByQuery(@Param("query") StatMemberQuery query);
}