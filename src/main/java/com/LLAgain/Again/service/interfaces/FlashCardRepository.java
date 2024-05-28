package com.LLAgain.Again.service.interfaces;

import com.LLAgain.Again.model.entity.FlashCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlashCardRepository extends JpaRepository<FlashCard, Long> {}
