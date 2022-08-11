package com.wang;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * @author: wangjingen
 * @description:
 * @createDate: 2022-08-02 10:16
 **/
@Component
public class WangBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor, Ordered {


	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("自己提供的");
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("自己提供的");
	}

	@Override
	public int getOrder() {
		return 0;
	}
}
