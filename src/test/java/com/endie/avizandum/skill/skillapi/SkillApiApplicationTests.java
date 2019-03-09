package com.endie.avizandum.skill.skillapi;

import com.endie.avizandum.SkillApiApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SkillApiApplication.class)
@TestPropertySource(locations= "classpath:test.properties")

public class SkillApiApplicationTests {

	@Test
	public void contextLoads() {
	}

}