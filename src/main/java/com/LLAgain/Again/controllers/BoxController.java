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

    @GetMapping("/byId/{id}")
    public List<FlashCard> getFlashCardsByPaperBox(@PathVariable Long id) {
        return flashCardService.getFlashCardsByPaperBox(id);
    }

    @GetMapping("/byName/{boxName}")
    public List<FlashCard> getPaperBoxByName(@PathVariable String boxName) {
        return paperBoxService.getBoxByName(boxName);
    }

    @GetMapping("/byName/{boxName}/{id}")
    public FlashCard getOnlyOneFlashcard(@PathVariable String boxName, @PathVariable Long id) {
       return flashCardService.getFlashCardById(boxName, id);
    }

    @PutMapping("/upBox/{findBox}")
    public PaperBox updateBox(@PathVariable String findBox, @RequestBody PaperBox newPaper) {
        return paperBoxService.updateBoxName(findBox, newPaper);
    }

    @PostMapping("/add")
    public PaperBox createBox(@RequestBody PaperBox paperBox) {
        return paperBoxService.createPaperBox(paperBox);
    }

    @DeleteMapping("/delBox/{id}")
    public void deleteBoxById(@PathVariable Long id) {
        paperBoxService.delPaperBoxById(id);
    }

    @GetMapping("/all")
    public List<PaperBox> allBox(){
        return paperBoxService.getAllPaperBox();
    }
}
