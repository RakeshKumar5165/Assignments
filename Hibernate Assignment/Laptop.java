package com.accolite.hibernate.Hibernate1;

import java.util.List;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
//@Embeddable
public class Laptop {
	@Id
	
	private int lid;
	 private String brand;
	 @OneToOne
	 private Student student;
	 
	 
	private String price;
	public int getId() {
	  return lid;
	 }
	 public void setId(int id) {
	  this.lid = id;
	 }
	 public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public String getBrand() {
	  return brand;
	 }
	 public void setBrand(String brand) {
	  this.brand = brand;
	 }
	 public String getPrice() {
	  return price;
	 }
	 public void setPrice(String price) {
	  this.price = price;
	 }
	 
}
