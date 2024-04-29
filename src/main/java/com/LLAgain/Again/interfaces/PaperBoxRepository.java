package com.LLAgain.Again.interfaces;

import com.LLAgain.Again.entity.FlashCard;
import com.LLAgain.Again.entity.PaperBox;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface PaperBoxRepository extends JpaRepository<PaperBox, Long> {
    Optional<PaperBox> findByName(String name);
}
