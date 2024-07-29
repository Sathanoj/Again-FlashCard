package com.LLAgain.Again.controllers;

import com.LLAgain.Again.model.entity.FlashCard;
import com.LLAgain.Again.service.interfaces.FlashCardService;
import com.LLAgain.Again.service.interfaces.PaperBoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:5173/")
@RestController
@RequestMapping("/box/flashcard")
public class FlashCardController {
    @Autowired
    FlashCardService flashCardService;
    @Autowired
    PaperBoxService paperBoxService;


    @PostMapping("/addFc/{name}")
    public FlashCard addFlashCard(@PathVariable String name, @RequestBody FlashCard flashCard) {
        return paperBoxService.addFlashCardinBox(name, flashCard);
    }

    @PutMapping("/{id}")
    public FlashCard updateFC(@RequestBody FlashCard flashCard, @PathVariable Long id) {
        return flashCardService.updateFlashCard(flashCard, id);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteFC(@PathVariable Long id) {
        flashCardService.deleteFlashCard(id);
    }
}
