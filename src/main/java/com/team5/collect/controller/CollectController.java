package com.team5.collect.controller;

import com.team5.collect.dto.CollectResponseDto;
import com.team5.collect.service.CollectService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CollectController {
    private final CollectService collectService;

    @GetMapping("/collects")
    public List<CollectResponseDto> receiveAll() {
        List<CollectResponseDto> responseDtos = collectService.receiveAll();
        return responseDtos;
    }
}
