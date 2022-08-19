package com.wang;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author: wangjingen
 * @description:
 * @createDate: 2022-08-15 10:05
 **/
@Component
public class WangTest implements ApplicationContextAware {

	@Autowired
	private Wxxx wxxx;

	@Value("${com.wang:12}")
	public Integer str;


	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("xxx");
	}
}
