package com.lenoblgis.sergey.controllers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lenoblgis.sergey.beans.Beans;
import com.lenoblgis.sergey.beans.LessonsConfiguration;

public class StarterForBean {

	public String run(){
		ApplicationContext context = new AnnotationConfigApplicationContext(LessonsConfiguration.class);
		Beans beanOne = context.getBean(Beans.class);
		return beanOne.sayWhoAreYou();
	}
}
