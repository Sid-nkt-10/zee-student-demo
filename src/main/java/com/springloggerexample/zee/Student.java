package com.springloggerexample.zee;

public class Student {

	private int id;
	private String name;
	private int total;
	
	public Student(int id, String name, int total) {
		super();
		this.id = id;
		this.name = name;
		this.total = total;
	}
	
	public Student() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
		
}
