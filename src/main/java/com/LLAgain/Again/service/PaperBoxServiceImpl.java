package com.LLAgain.Again.service;

import com.LLAgain.Again.model.entity.FlashCard;
import com.LLAgain.Again.model.entity.PaperBox;
import com.LLAgain.Again.service.interfaces.PaperBoxRepository;
import com.LLAgain.Again.service.interfaces.PaperBoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaperBoxServiceImpl implements PaperBoxService {

    @Autowired
    PaperBoxRepository paperBoxRepository;

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
            throw new RuntimeException("PaperBox not found with this name: " + name);
        }
    }

    @Override
    public List<PaperBox> getAllPaperBox() {
        return paperBoxRepository.findAll();
    }
}
