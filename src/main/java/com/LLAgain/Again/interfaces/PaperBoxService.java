package com.LLAgain.Again.interfaces;

import com.LLAgain.Again.entity.FlashCard;
import com.LLAgain.Again.entity.PaperBox;

import java.util.List;

public interface PaperBoxService {

    PaperBox createPaperBox(PaperBox paperBox);
    FlashCard addFlashCardinBox(String name, FlashCard flashCard);
    List<PaperBox> getAllPaperBox();


}
