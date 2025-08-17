package com.mall.statistics.adapter.in.web;

import com.mall.statistics.common.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * 健康检查控制器
 */
@RestController
@RequestMapping("/api/health")
@Tag(name = "健康检查", description = "服务健康状态检查接口")
public class HealthController {

    /**
     * 健康检查
     */
    @GetMapping("/check")
    @Operation(summary = "健康检查", description = "检查服务运行状态")
    public Result<Map<String, Object>> healthCheck() {
        Map<String, Object> health = new HashMap<>();
        health.put("status", "UP");
        health.put("service", "mall-statistics-service");
        health.put("timestamp", LocalDateTime.now());
        health.put("version", "1.0.0");
        
        return Result.success(health);
    }
}