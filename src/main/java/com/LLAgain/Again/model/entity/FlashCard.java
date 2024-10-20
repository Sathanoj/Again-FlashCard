package com.LLAgain.Again.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table
public class FlashCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String word;
    private String wordtranslate;
    

//    public void addPaperBox(PaperBox paperBox) {
//
//    }
}
