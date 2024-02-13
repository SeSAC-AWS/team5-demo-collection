package com.team5.collect.service;

import com.team5.collect.dto.BookRequestDto;
import com.team5.collect.dto.BookResponseDto;
import com.team5.collect.entity.Book;
import com.team5.collect.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;
    public List<BookResponseDto> receiveAll() {
        return bookRepository.findAll()
                .stream()
                .map(BookResponseDto::new)
                .toList();
    }

    public BookResponseDto create(BookRequestDto requestDto) {
        Book book = new Book(requestDto);
        bookRepository.save(book);
        return new BookResponseDto(book);
    }
}
