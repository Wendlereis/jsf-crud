package br.com.fiap.crud.bean;

public class PersonBean {
	String name;
	Double salary;
	String gender;
	
	public PersonBean() {

	}
	
	public PersonBean(String name, Double salary, String gender) {
		this.name = name;
		this.salary = salary;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
