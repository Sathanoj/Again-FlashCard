package com.LLAgain.Again.service.interfaces;

import com.LLAgain.Again.model.entity.FlashCard;
import com.LLAgain.Again.model.entity.PaperBox;

import java.util.List;

public interface PaperBoxService {

    PaperBox createPaperBox(PaperBox paperBox);
    FlashCard addFlashCardinBox(String box_name, FlashCard flashCard);
    List<PaperBox> getAllPaperBox();
    List<FlashCard> getBoxByName(String boxName);
    PaperBox updateBoxName(String newBoxName, PaperBox paperBox);
    void delPaperBoxById(Long id);

}
