package com.team5.collect.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "letter")
public class Collect {
    @Id
    private Integer id;

    @Column(nullable = false)
    private String content;
}
