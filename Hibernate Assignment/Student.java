package com.accolite.hibernate.Hibernate1;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity


public class Student {
private String Name;


public Laptop getLaptop() {
	return laptop;
}
public void setLaptop(Laptop laptop) {
	this.laptop = laptop;
}
public List<Expenses> getExpenses() {
	return expenses;
}
public void setExpenses(List<Expenses> expenses) {
	this.expenses = expenses;
}
@Id
private int sid;
@OneToOne
private Laptop laptop;
@OneToMany
private List<Expenses> expenses=new ArrayList<Expenses>();

public int getId() {
	return sid;
}
public void setId(int id) {
	this.sid = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}



}
