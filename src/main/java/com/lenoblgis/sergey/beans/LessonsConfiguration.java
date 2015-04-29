package com.lenoblgis.sergey.beans;

import org.springframework.context.annotation.Bean;

public class LessonsConfiguration {

	@Bean
	Beans getFirstBean(){
		return new FirstBean();
	}
	
}
