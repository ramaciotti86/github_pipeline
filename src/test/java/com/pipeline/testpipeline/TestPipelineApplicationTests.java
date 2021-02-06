package com.pipeline.testpipeline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestPipelineApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testSimple(){
		Assertions.assertEquals(0, 1);
		Assertions.assertEquals(0, 2);
	}

}
