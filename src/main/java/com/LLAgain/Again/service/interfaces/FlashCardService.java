package com.LLAgain.Again.service.interfaces;

import com.LLAgain.Again.model.entity.FlashCard;

import java.util.List;

public interface FlashCardService {

    List<FlashCard> getFlashCardsByPaperBox(Long id);
    FlashCard findById(Long id);
    FlashCard getFlashCardById(String boxName, Long id);
    FlashCard updateFlashCard(FlashCard flashCard, Long id);
    void deleteFlashCard(Long id);

}
