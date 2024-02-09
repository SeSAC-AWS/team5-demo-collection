package com.team5.collect.service;

import com.team5.collect.dto.CollectResponseDto;
import com.team5.collect.repository.CollectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CollectService {
    private final CollectRepository collectRepository;
    public List<CollectResponseDto> receiveAll() {
        return collectRepository.findAll()
                .stream()
                .map(CollectResponseDto::new)
                .toList();
    }
}
