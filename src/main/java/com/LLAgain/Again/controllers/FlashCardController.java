package com.LLAgain.Again.controllers;

import com.LLAgain.Again.entity.FlashCard;
import com.LLAgain.Again.interfaces.FlashCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173/")
@RestController
@RequestMapping("/flashcard")
public class FlashCardController {
    @Autowired
    FlashCardRepository fcr;

    @GetMapping
    public List<FlashCard> find() {
        return fcr.findAll();
    }
    @GetMapping("/{id}")
    public FlashCard findID(@PathVariable Long id) {
        return fcr.findById(id).get();
    }

    @PostMapping("/add")
    public FlashCard save(@RequestBody FlashCard fc) {
        return fcr.save(fc);
    }

    @PutMapping("/{id}")
    public FlashCard updateFC(@RequestBody FlashCard fc, @PathVariable Long id) {
        FlashCard findfc = fcr.findById(id).get();
        findfc.setWord(fc.getWord());
        findfc.setWordtranslate(fc.getWordtranslate());
        return fcr.save(findfc);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteFC(@PathVariable Long id) {
        fcr.deleteById(id);
    }
}
