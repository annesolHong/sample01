package com.ezen.sol3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Score {
public static void main(String[] args) {
	AnnotationConfigApplicationContext acct =
	new AnnotationConfigApplicationContext(ScoreConfig.class);
ScoreDTO dto = acct.getBean("result",ScoreDTO.class);
dto.out();

//String path ="classpath:study.xml";
//AbstractApplicationContext aact =
//	new GenericXmlApplicationContext(path);
//
//ScoreDTO dto = aact.getBean("all",ScoreDTO.class);
//dto.out();

	
	
}
	
	
}
