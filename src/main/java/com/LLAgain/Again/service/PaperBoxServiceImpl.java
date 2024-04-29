package com.LLAgain.Again.service;

import com.LLAgain.Again.entity.PaperBox;
import com.LLAgain.Again.interfaces.PaperBoxRepository;
import com.LLAgain.Again.interfaces.PaperBoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaperBoxServiceImpl implements PaperBoxService {

    @Autowired
    PaperBoxRepository paperBoxRepository;
    @Override
    public PaperBox createPaperBox(PaperBox paperBox) {
        return paperBoxRepository.save(paperBox);
    }

    @Override
    public List<PaperBox> getAllPaperBox() {
        return paperBoxRepository.findAll();
    }
}
