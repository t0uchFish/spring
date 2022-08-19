package com.wang;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

/**
 * @author: wangjingen
 * @description:
 * @createDate: 2022-08-09 17:19
 **/
public class Wxxx implements ImportSelector {


	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{"com.wang.W123"};
	}
}
