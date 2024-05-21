package com.LLAgain.Again.interfaces;

import com.LLAgain.Again.entity.FlashCard;

import java.util.List;

public interface FlashCardService {

    List<FlashCard> getFlashCardsByPaperBox(Long id);
    FlashCard findById(Long id);
    FlashCard updateFlashCard(FlashCard flashCard, Long id);
    void deleteFlashCard(Long id);
}
