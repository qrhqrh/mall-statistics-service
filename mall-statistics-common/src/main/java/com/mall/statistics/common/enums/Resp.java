package com.mall.statistics.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 响应状态码枚举
 * 格式：STAT + 5位数字，总长度9位
 * 00000-00999: 通用状态码
 * 01000-01999: 统计数据相关
 * 02000-02999: 报表生成相关
 * 03000-03999: 数据分析相关
 * 04000-04999: 数据导出相关
 * 99000-99999: 系统错误相关
 */
@Getter
@AllArgsConstructor
public enum Resp {
    // 通用状态码
    SUCCESS("STAT00000", "success"),
    FAIL("STAT99999", "fail"),
    BAD_REQUEST("STAT00400", "请求错误"),
    INVALID_PARAM("STAT00401", "非法参数"),
    JSON_FORMAT_ERROR("STAT00402", "JSON格式错误"),
    
    // 统计数据相关
    STAT_DATA_NOT_FOUND("STAT01000", "统计数据不存在"),
    STAT_DATA_QUERY_FAILED("STAT01001", "统计数据查询失败"),
    STAT_DATA_UPDATE_FAILED("STAT01002", "统计数据更新失败"),
    STAT_DATA_DELETE_FAILED("STAT01003", "统计数据删除失败"),
    STAT_DATA_CREATE_FAILED("STAT01004", "统计数据创建失败"),
    STAT_DATE_RANGE_INVALID("STAT01005", "统计日期范围无效"),
    STAT_PERIOD_INVALID("STAT01006", "统计周期无效"),
    
    // 报表生成相关
    REPORT_GENERATE_FAILED("STAT02000", "报表生成失败"),
    REPORT_TEMPLATE_NOT_FOUND("STAT02001", "报表模板不存在"),
    REPORT_DATA_EMPTY("STAT02002", "报表数据为空"),
    REPORT_FORMAT_UNSUPPORTED("STAT02003", "不支持的报表格式"),
    REPORT_PERMISSION_DENIED("STAT02004", "报表访问权限不足"),
    
    // 数据分析相关
    ANALYSIS_PARAM_INVALID("STAT03000", "分析参数无效"),
    ANALYSIS_DATA_INSUFFICIENT("STAT03001", "分析数据不足"),
    ANALYSIS_ALGORITHM_ERROR("STAT03002", "分析算法错误"),
    ANALYSIS_RESULT_EMPTY("STAT03003", "分析结果为空"),
    
    // 数据导出相关
    EXPORT_FAILED("STAT04000", "数据导出失败"),
    EXPORT_FORMAT_UNSUPPORTED("STAT04001", "不支持的导出格式"),
    EXPORT_DATA_TOO_LARGE("STAT04002", "导出数据量过大"),
    EXPORT_PERMISSION_DENIED("STAT04003", "导出权限不足"),
    
    // 系统错误相关
    SYSTEM_ERROR("STAT99000", "系统错误"),
    DATABASE_ERROR("STAT99001", "数据库错误"),
    NETWORK_ERROR("STAT99002", "网络错误"),
    SERVICE_UNAVAILABLE("STAT99003", "服务不可用");
    
    private final String code;
    private final String message;
}