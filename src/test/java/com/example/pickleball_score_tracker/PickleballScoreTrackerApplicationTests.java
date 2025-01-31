package com.example.pickleball_score_tracker;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(properties = {
		"security.jwt.secret-key=3cfa76ef14937c1c0ea519f8fc057a80fcd04a7420f8e8bcd0a7567c272e007b",
		"security.jwt.expiration-time=3600000"
})
class PickleballScoreTrackerApplicationTests {

	@Test
	void contextLoads() {
	}

}
