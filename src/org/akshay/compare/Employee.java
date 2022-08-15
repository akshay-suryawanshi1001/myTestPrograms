package org.akshay.compare;

public class Employee implements Comparable<Employee>{
	
	private Integer id;
	
	private String name;
	
	private Double rating;
	
	@Override
	public int compareTo(Employee o) {
		return this.id - o.getId(); //o.getId() - this.id  this would give in desc order
	}

	public Employee(Integer id, String name, Double rating) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}
	

}
