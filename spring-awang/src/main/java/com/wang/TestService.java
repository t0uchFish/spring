package com.wang;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: wangjingen
 * @description:
 * @createDate: 2022-07-16 11:09
 **/
@Configuration
public class TestService {

	@Bean
	public Wxxx wxxx() {
		System.out.println("开始执行了");
		return new Wxxx();
	}

	@Bean
	public W123 w123(){
		wxxx();
		System.out.println("sada");
		return new W123();
	}

}
