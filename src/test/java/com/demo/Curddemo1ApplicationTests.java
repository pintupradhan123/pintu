package com.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demoRepository.BaapRepository;

@SpringBootTest
class Curddemo1ApplicationTests {
	@Autowired
	private BaapRepository baapRepository;

	@Test
	void contextLoads() {
		System.out.println(baapRepository);
	}

}
