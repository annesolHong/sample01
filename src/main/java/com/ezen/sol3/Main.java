package com.ezen.sol3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
//		AnnotationConfigApplicationContext acct =
//				new AnnotationConfigApplicationContext(InfoConfig.class);
//		InfoDTO dto = acct.getBean("cal",InfoDTO.class);
//		dto.out();

		String path = "classpath:helpme.xml";
		AbstractApplicationContext aact =
				new GenericXmlApplicationContext(path);
		
		InfoDTO dto = aact.getBean("info",InfoDTO.class);
		dto.out();
		
//		InfoDTO dto = new InfoDTO();
//		dto.id="munseon";
//		dto.pw="5d4s3e";
//		dto.out();
	}

}
