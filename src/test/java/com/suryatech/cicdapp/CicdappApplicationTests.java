package com.suryatech.cicdapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.springframework.test.util.AssertionErrors.assertEquals;

@SpringBootTest
class CicdappApplicationTests {

	@Test
	void contextLoads() {
		assertEquals("Testing","Test","Test");
	}

}
