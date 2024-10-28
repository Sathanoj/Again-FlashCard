package com.LLAgain.Again.model.dao;

import com.LLAgain.Again.model.entity.PaperBox;
import lombok.Data;

import java.util.List;

@Data
public class FlashCardDAO {

    private Long id;
    private String word;
    private String wordtranslate;
    private List<PaperBox> PaperBox;
}
