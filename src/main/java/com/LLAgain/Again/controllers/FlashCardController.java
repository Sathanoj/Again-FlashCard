package com.LLAgain.Again.controllers;

import com.LLAgain.Again.entity.FlashCard;
import com.LLAgain.Again.interfaces.FlashCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173/")
@RestController
@RequestMapping("/flashcard")
public class FlashCardController {
    @Autowired
    FlashCardService flashCardService;

    @GetMapping
    public List<FlashCard> find() {
        return flashCardService.getAllFlashCard();
    }
    @GetMapping("/{id}")
    public FlashCard findID(@PathVariable Long id) {
        return flashCardService.findById(id);
    }

    @PostMapping("/add")
    public FlashCard save(@RequestBody FlashCard flashCard) {
        return flashCardService.createFlashCard(flashCard);
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
