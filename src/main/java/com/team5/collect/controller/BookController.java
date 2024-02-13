package com.team5.collect.controller;

import com.team5.collect.dto.BookRequestDto;
import com.team5.collect.dto.BookResponseDto;
import com.team5.collect.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @PostMapping("/books")
    public ResponseEntity<BookResponseDto> create(@RequestBody BookRequestDto requestDto) {
        BookResponseDto responseDto = bookService.create(requestDto);
        return ResponseEntity.ok(responseDto);
    }

    @GetMapping("/books")
    public List<BookResponseDto> receiveAll() {
        List<BookResponseDto> responseDtos = bookService.receiveAll();
        return responseDtos;
    }
}
