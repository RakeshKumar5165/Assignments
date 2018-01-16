package com.accolite.hibernate.Hibernate1;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Expenses {

	@Id
	private int eid;
	private String type;
	private int expense;
	
	public int getId() {
		return eid;
	}
	public void setId(int id) {
		this.eid = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getExpense() {
		return expense;
	}
	public void setExpense(int expense) {
		this.expense = expense;
	}
}
