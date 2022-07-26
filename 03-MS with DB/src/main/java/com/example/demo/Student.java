package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {

	@Id
	private int id_number;
	private String first_Name;
	private String last_Name;
	
	public int getId() {
		return id_number;
	}
	public void setId(int id) {
		this.id_number = id;
	}
	public String getFirstName() {
		return first_Name;
	}
	public void setFirstName(String firstName) {
		this.first_Name = firstName;
	}
	public String getLastName() {
		return last_Name;
	}
	public void setLastName(String lastName) {
		this.last_Name = lastName;
	}
	
	
}
