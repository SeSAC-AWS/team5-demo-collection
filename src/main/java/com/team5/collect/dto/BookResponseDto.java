package com.team5.collect.dto;

import com.team5.collect.entity.Book;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class BookResponseDto {
    private Integer id;
    private String name;
    private Integer price;

    public BookResponseDto(Book book) {
        this.id = book.getId();
        this.name = book.getName();
        this.price = book.getPrice();
    }
}
