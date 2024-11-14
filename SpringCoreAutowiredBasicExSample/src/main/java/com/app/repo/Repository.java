package com.app.repo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Repository {
	
	@Value("SPRING_BOOT")
	private String entity;

	@Override
	public String toString() {
		return "Repository [entity=" + entity + "]";
	}
	
	
	
	

}
