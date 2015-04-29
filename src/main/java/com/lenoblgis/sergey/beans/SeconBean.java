package com.lenoblgis.sergey.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Second")
public class SeconBean implements Beans {

	@Override
	public String sayWhoAreYou() {
		return "I'm second bean!";
	}

}
