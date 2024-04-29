package com.LLAgain.Again.interfaces;

import com.LLAgain.Again.entity.PaperBox;

import java.util.List;

public interface PaperBoxService {

    PaperBox createPaperBox(PaperBox paperBox);

    List<PaperBox> getAllPaperBox ();
}
