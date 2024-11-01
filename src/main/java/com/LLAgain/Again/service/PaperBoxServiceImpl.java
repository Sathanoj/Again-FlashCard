package com.LLAgain.Again.service;

import com.LLAgain.Again.model.entity.FlashCard;
import com.LLAgain.Again.model.entity.PaperBox;
import com.LLAgain.Again.service.interfaces.PaperBoxRepository;
import com.LLAgain.Again.service.interfaces.PaperBoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Paper;
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
    public FlashCard addFlashCardinBox(String box_name, FlashCard flashCard) {

        Optional<PaperBox> paperBoxOptional = paperBoxRepository.findByName(box_name);
        if(paperBoxOptional.isPresent()) {
            PaperBox paperBox = paperBoxOptional.get();
            paperBox.getFlashCards().add(flashCard);
            paperBoxRepository.save(paperBox);
            return flashCard;
        }else {
            throw new RuntimeException("PaperBox not found for add this FlashCard: " + box_name);
        }
    }

    @Override
    public List<PaperBox> getAllPaperBox() {
        return paperBoxRepository.findAll();
    }

    @Override
    public List<FlashCard> getBoxByName(String boxName) {
        Optional<PaperBox> getBox = paperBoxRepository.findByName(boxName);
        if (getBox.isPresent()) {
            PaperBox paperBox = getBox.get();
            return paperBox.getFlashCards();
        }else {
            throw new RuntimeException("PaperBox not found with this name: " + boxName);
        }
    }

    @Override
    public PaperBox updateBoxName(String findBox, PaperBox paperBox) {
        Optional<PaperBox> findPaperBox = paperBoxRepository.findByName(findBox);
        if (findPaperBox.isPresent()) {
            PaperBox paperBoxUpdated = findPaperBox.get();
            paperBoxUpdated.setName(paperBox.getName());
            paperBoxRepository.save(paperBoxUpdated);
            return paperBoxUpdated;
        } else {
            throw new RuntimeException("PaperBox not found with this name: " + findBox);
        }
    }

    @Override
    public void delPaperBoxById(Long id) {
        paperBoxRepository.deleteById(id);
    }
}