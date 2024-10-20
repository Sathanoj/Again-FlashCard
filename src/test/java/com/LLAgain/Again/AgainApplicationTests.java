package com.LLAgain.Again;

import com.LLAgain.Again.service.interfaces.FlashCardService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AgainApplicationTests {

	FlashCardService flashCardService;

	@Test
	void contextLoads() {
	}

	@Test
	void flashCardById(String teste, Long teste2) {

		flashCardService.getFlashCardById(teste, teste2);
	}

}
