package com.mall.statistics.adapter.out.persistence.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mall.statistics.domain.entity.StatHours;
import com.mall.statistics.application.query.StatHoursQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 小时统计数据Mapper
 */
@Mapper
public interface StatHoursMapper extends BaseMapper<StatHours> {
    
    /**
     * 根据查询条件查询小时统计数据
     * @param query 查询条件
     * @return 统计数据列表
     */
    List<StatHours> selectByQuery(@Param("query") StatHoursQuery query);
}