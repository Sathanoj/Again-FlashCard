package com.LLAgain.Again.service.interfaces;

import com.LLAgain.Again.model.entity.PaperBox;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface PaperBoxRepository extends JpaRepository<PaperBox, Long> {
    Optional<PaperBox> findByName(String name);
}
