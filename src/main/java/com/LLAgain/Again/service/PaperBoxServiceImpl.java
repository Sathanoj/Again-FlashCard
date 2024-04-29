package com.LLAgain.Again.service;

import com.LLAgain.Again.entity.FlashCard;
import com.LLAgain.Again.entity.PaperBox;
import com.LLAgain.Again.interfaces.FlashCardRepository;
import com.LLAgain.Again.interfaces.PaperBoxRepository;
import com.LLAgain.Again.interfaces.PaperBoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaperBoxServiceImpl implements PaperBoxService {

    @Autowired
    PaperBoxRepository paperBoxRepository;
    @Autowired
    FlashCardRepository flashCardRepository;

    @Override
    public PaperBox createPaperBox(PaperBox paperBox) {
        return paperBoxRepository.save(paperBox);
    }

    @Override
    public FlashCard addFlashCardinBox(String name, FlashCard flashCard) {
        Optional<PaperBox> paperBoxOptional = paperBoxRepository.findByName(name);
        if(paperBoxOptional.isPresent()) {
            PaperBox paperBox = paperBoxOptional.get();
            paperBox.getFlashCards().add(flashCard);
            paperBoxRepository.save(paperBox);
            return flashCard;
        }else {
            throw new RuntimeException("PaperBox não encontrado com o nome: " + name);
        }
    }

    @Override
    public List<PaperBox> getAllPaperBox() {
        return paperBoxRepository.findAll();
    }
}
