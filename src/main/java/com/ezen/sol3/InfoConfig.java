package com.ezen.sol3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InfoConfig {
@Bean
	public InfoDTO cal() {
	InfoDTO dto = new InfoDTO();
	dto.setId("meem12");
	dto.setPw("12345");
	return dto;
}

}
