package com.mall.statistics.adapter.in.web;

import com.mall.statistics.application.dto.StatHoursDto;
import com.mall.statistics.application.dto.StatMemberDto;
import com.mall.statistics.application.dto.StatOrdersDto;
import com.mall.statistics.application.port.in.StatHoursQueryUseCase;
import com.mall.statistics.application.port.in.StatMemberQueryUseCase;
import com.mall.statistics.application.port.in.StatOrdersQueryUseCase;
import com.mall.statistics.application.query.StatHoursQuery;
import com.mall.statistics.application.query.StatMemberQuery;
import com.mall.statistics.application.query.StatOrdersQuery;
import com.mall.statistics.common.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 统计数据控制器
 */
@RestController
@RequestMapping("/api/statistics")
@RequiredArgsConstructor
@Tag(name = "统计数据管理", description = "统计数据查询接口")
public class StatisticsController {
    
    private final StatHoursQueryUseCase statHoursQueryUseCase;
    private final StatMemberQueryUseCase statMemberQueryUseCase;
    private final StatOrdersQueryUseCase statOrdersQueryUseCase;
    
    /**
     * 查询小时统计数据
     */
    @GetMapping("/hours")
    @Operation(summary = "查询小时统计数据", description = "根据条件查询小时统计数据")
    public Result<List<StatHoursDto>> queryStatHours(
            @Parameter(description = "开始日期") @RequestParam(required = false) 
            @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime startDate,
            @Parameter(description = "结束日期") @RequestParam(required = false) 
            @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime endDate,
            @Parameter(description = "统计小时") @RequestParam(required = false) Integer statHour,
            @Parameter(description = "页码") @RequestParam(defaultValue = "1") Integer pageNum,
            @Parameter(description = "页大小") @RequestParam(defaultValue = "10") Integer pageSize) {
        
        StatHoursQuery query = new StatHoursQuery();
        query.setStartDate(startDate);
        query.setEndDate(endDate);
        query.setStatHour(statHour);
        query.setPageNum(pageNum);
        query.setPageSize(pageSize);
        
        List<StatHoursDto> result = statHoursQueryUseCase.queryStatHours(query);
        return Result.success(result);
    }
    
    /**
     * 查询订单统计数据
     */
    @GetMapping("/orders")
    @Operation(summary = "查询订单统计数据", description = "根据条件查询订单统计数据")
    public Result<List<StatOrdersDto>> queryStatOrders(
            @Parameter(description = "会员ID") @RequestParam(required = false) Integer memberId,
            @Parameter(description = "店铺ID") @RequestParam(required = false) Integer storeId,
            @Parameter(description = "订单状态") @RequestParam(required = false) Integer ordersState,
            @Parameter(description = "开始时间") @RequestParam(required = false) 
            @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime startTime,
            @Parameter(description = "结束时间") @RequestParam(required = false) 
            @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime endTime,
            @Parameter(description = "页码") @RequestParam(defaultValue = "1") Integer pageNum,
            @Parameter(description = "页大小") @RequestParam(defaultValue = "10") Integer pageSize) {
        
        StatOrdersQuery query = new StatOrdersQuery();
        query.setMemberId(memberId);
        query.setStoreId(storeId);
        query.setOrdersState(ordersState);
        query.setStartTime(startTime);
        query.setEndTime(endTime);
        query.setPageNum(pageNum);
        query.setPageSize(pageSize);
        
        List<StatOrdersDto> result = statOrdersQueryUseCase.queryStatOrders(query);
        return Result.success(result);
    }
    
    /**
     * 查询会员统计数据
     */
    @GetMapping("/members")
    @Operation(summary = "查询会员统计数据", description = "根据条件查询会员统计数据")
    public Result<List<StatMemberDto>> queryStatMember(
            @Parameter(description = "会员ID") @RequestParam(required = false) Integer memberId,
            @Parameter(description = "会员名称") @RequestParam(required = false) String memberName,
            @Parameter(description = "开始日期") @RequestParam(required = false) 
            @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime startDate,
            @Parameter(description = "结束日期") @RequestParam(required = false) 
            @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime endDate,
            @Parameter(description = "页码") @RequestParam(defaultValue = "1") Integer pageNum,
            @Parameter(description = "页大小") @RequestParam(defaultValue = "10") Integer pageSize) {
        
        StatMemberQuery query = new StatMemberQuery();
        query.setMemberId(memberId);
        query.setMemberName(memberName);
        query.setStartDate(startDate);
        query.setEndDate(endDate);
        query.setPageNum(pageNum);
        query.setPageSize(pageSize);
        
        List<StatMemberDto> result = statMemberQueryUseCase.queryStatMember(query);
        return Result.success(result);
    }
}