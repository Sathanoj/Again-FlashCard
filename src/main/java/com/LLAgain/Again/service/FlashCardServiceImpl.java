package com.LLAgain.Again.service;

import com.LLAgain.Again.model.entity.FlashCard;
import com.LLAgain.Again.model.entity.PaperBox;
import com.LLAgain.Again.service.interfaces.FlashCardRepository;
import com.LLAgain.Again.service.interfaces.FlashCardService;
import com.LLAgain.Again.service.interfaces.PaperBoxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlashCardServiceImpl implements FlashCardService {

    @Autowired
    FlashCardRepository flashCardRepository;
    @Autowired
    PaperBoxRepository paperBoxRepository;

    @Override
    public List<FlashCard> getFlashCardsByPaperBox(Long paperBoxId) {
        Optional<PaperBox> findPaperBox = paperBoxRepository.findById(paperBoxId);
        if(findPaperBox.isPresent()) {
            return findPaperBox.get().getFlashCards();
        } else {
            throw new RuntimeException("PaperBox not found with this ID: " + paperBoxId);
        }
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
