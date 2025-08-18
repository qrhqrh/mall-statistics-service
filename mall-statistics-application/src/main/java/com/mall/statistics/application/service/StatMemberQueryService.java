package com.mall.statistics.application.service;

import com.mall.statistics.application.dto.StatMemberDto;
import com.mall.statistics.application.port.in.StatMemberQueryUseCase;
import com.mall.statistics.application.query.StatMemberQuery;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatMemberQueryService implements StatMemberQueryUseCase {
    @Override
    public List<StatMemberDto> queryStatMember(StatMemberQuery query) {
        return List.of();
    }
}
