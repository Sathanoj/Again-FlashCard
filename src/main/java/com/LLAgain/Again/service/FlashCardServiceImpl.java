package com.LLAgain.Again.service;

import com.LLAgain.Again.entity.FlashCard;
import com.LLAgain.Again.interfaces.FlashCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlashCardServiceImpl implements  FlashCardService{

    @Autowired
    FlashCardRepository flashCardRepository;

    @Override
    public FlashCard createFlashCard(FlashCard flashCard) {
        return flashCardRepository.save(flashCard);
    }

    @Override
    public List<FlashCard> getAllFlashCard() {
        return flashCardRepository.findAll();
    }

    @Override
    public FlashCard findById(Long id) {
        return flashCardRepository.findById(id).get();
    }

    @Override
    public FlashCard updateFlashCard(FlashCard flashCard, Long id) {
        FlashCard findFlashCard = findById(id);
        findFlashCard.setWord(flashCard.getWord());
        findFlashCard.setWordtranslate(flashCard.getWordtranslate());
        return flashCardRepository.save(findFlashCard);
    }

    @Override
    public void deleteFlashCard(Long id) {
        flashCardRepository.deleteById(id);
    }


}
