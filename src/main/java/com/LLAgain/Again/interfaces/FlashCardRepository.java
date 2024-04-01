package com.LLAgain.Again.interfaces;

import com.LLAgain.Again.entity.FlashCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlashCardRepository extends JpaRepository<FlashCard, Long> {}
