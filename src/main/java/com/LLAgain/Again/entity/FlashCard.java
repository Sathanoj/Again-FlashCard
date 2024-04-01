package com.LLAgain.Again.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table
public class FlashCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "word")
    private String word;
    @Column(name = "wordtranslate")
    private String wordtranslate;
}
