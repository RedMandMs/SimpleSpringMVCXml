package com.lenoblgis.sergey.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("First")
public class FirstBean implements Beans {

	@Override
	public String sayWhoAreYou() {
		return "I'm First bean!";
	}

}
