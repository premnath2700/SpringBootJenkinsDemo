package com.jenkins.jenkinsdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
class JenkinsdemoApplicationTests {
	@Autowired
	private MockMvc mockMvc;

	@Test
	void greetingsFromJenkinTest() throws Exception {
		
		MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/jenkinsdemo/greetings").accept(MediaType.APPLICATION_JSON);
		
		MvcResult result = mockMvc.perform(request).andReturn();
		String contentAsString = result.getResponse().getContentAsString();
		
		assertEquals("Hello from Jenkins!", contentAsString);
		assertNotEquals("Hello from Jenkins!!!", contentAsString);
		
	}

}
