package com.LLAgain.Again.controllers;

import com.LLAgain.Again.model.entity.FlashCard;
import com.LLAgain.Again.model.entity.PaperBox;
import com.LLAgain.Again.service.interfaces.FlashCardService;
import com.LLAgain.Again.service.interfaces.PaperBoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/box")
public class BoxController {

    @Autowired
    FlashCardService flashCardService;
    @Autowired
    PaperBoxService paperBoxService;

    @GetMapping("/{id}")
    public List<FlashCard> getFlashCardsByPaperBox(@PathVariable Long id) {
        return flashCardService.getFlashCardsByPaperBox(id);
    }

    @PostMapping("/add")
    public PaperBox createBox(@RequestBody PaperBox paperBox) {
        return paperBoxService.createPaperBox(paperBox);
    }

    @GetMapping("/all")
    public List<PaperBox> allBox(){
        return paperBoxService.getAllPaperBox();
    }
}
