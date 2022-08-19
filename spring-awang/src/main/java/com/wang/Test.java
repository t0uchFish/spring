package com.wang;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

/**
 * @author: wangjingen
 * @description:
 * @createDate: 2022-07-16 11:07
 **/

@Configuration
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println(ac.getBean(WangTest.class).str);
	}

}
