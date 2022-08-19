package com.wang;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

/**
 * @author: wangjingen
 * @description:
 * @createDate: 2022-07-16 11:07
 **/

@ComponentScan("com.wang")
@Configuration
@EnableAspectJAutoProxy
@Import(Wxxx.class)
public class AppConfig {

	public static void main(String[] args) {

	}


}
