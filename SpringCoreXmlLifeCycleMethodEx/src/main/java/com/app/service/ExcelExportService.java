package com.app.service;

public class ExcelExportService {
	private String filename;
	private String mode;

	public void setup() {
		//This is call 2st by spring container
		System.out.println("FROM INIT METHOD");
	}

	
	public void clean() {
		System.out.println("FROM DESTROY METHOD");
	}
	
	//This is call 1st by spring container
	public ExcelExportService() {
		super();
		System.out.println("FROM CONSTRUCTOR");
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	@Override
	public String toString() {
		return "ExcelExportService [filename=" + filename + ", mode=" + mode + "]";
	}

}
