package com.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Aspect
public class SampleAspect {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
}
