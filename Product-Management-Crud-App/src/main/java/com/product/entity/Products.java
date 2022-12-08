package com.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products_dtls1")
public class Products {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "name")
	private String Name;
	
	private String Email;
	private int DOB;
	private int Age;
	private int Salary;
	private String Status;

	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Products(String Name, String Email, int DOB,int Age, int Salary,String Status) {
		super();
		this.Name = Name;
		this.Email = Email;
		this.DOB = DOB;
		this.Age = Age;
		this.Salary = Salary;
		this.Status = Status;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}

	public int getDOB() {
		return DOB;
	}

	public void setDOB(int DOB) {
		this.DOB = DOB;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int Age) {
		this.Age = Age;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int Salary) {
		this.Salary = Salary;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String Status) {
		this.Status = Status;
	}

	@Override
	public String toString() {
		return "Products [id=" + id + ", Name=" + Name + ", Email=" + Email + ", DOB="
				+ DOB + ", Age=" + Age + ",Salary=" + Salary +",Status=" + Status +"]";
	}

}
