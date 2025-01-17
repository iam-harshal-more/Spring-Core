package com.app.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("con")
public class DatabaseConnection {
	@Value("${my.db.driver}")
	private String driver;
	
	@Value("${my.db-url=jdbc}")
	private String url;
	
	@Value("${my.db_user}")
	private String userName;
	
	@Value("${my.db-pwd}")
	private String userPwd;
	
	@Override
	public String toString() {
		return "DatabaseConnection [driver=" + driver + ", url=" + url + ", userName=" + userName + ", userPwd="
				+ userPwd + "]";
	}
	

}
