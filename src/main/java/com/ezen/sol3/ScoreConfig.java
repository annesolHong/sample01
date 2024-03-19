package com.ezen.sol3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ScoreConfig {
@Bean
	public ScoreDTO result() {
		ScoreDTO dto = new ScoreDTO();
		dto.setName("È«¹®¼±");
		dto.setKor(56);
		dto.setEng(78);
		dto.setMat(91);
		return dto;
	}

}
