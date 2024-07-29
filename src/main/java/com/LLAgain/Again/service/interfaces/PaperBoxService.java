package com.LLAgain.Again.service.interfaces;

import com.LLAgain.Again.model.entity.FlashCard;
import com.LLAgain.Again.model.entity.PaperBox;

import java.util.List;

public interface PaperBoxService {

    PaperBox createPaperBox(PaperBox paperBox);
    FlashCard addFlashCardinBox(String name, FlashCard flashCard);
    List<PaperBox> getAllPaperBox();


}