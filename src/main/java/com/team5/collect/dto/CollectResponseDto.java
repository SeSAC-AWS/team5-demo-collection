package com.team5.collect.dto;

import com.team5.collect.entity.Collect;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CollectResponseDto {
    private Integer id;
    private String content;

    public CollectResponseDto(Collect collect) {
        this.id = collect.getId();
        this.content = collect.getContent();
    }
}
