package com.app.serv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.repo.Repository;

@Component
public class MyService {
	
	@Autowired
	private Repository repo;

	@Override
	public String toString() {
		return "MyService [repo=" + repo + "]";
	}
	
	
	

}
