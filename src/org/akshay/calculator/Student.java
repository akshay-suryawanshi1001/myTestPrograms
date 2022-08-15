package org.akshay.calculator;

public class Student {
	private String name;
    private Long id;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Student(String name, Long id) {
		super();
		this.name = name;
		this.id = id;
	}
}
