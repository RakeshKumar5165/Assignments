package com.accolite.hibernate.Hibernate1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;

//import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Student st=new Student();
       st.setId(1);
       st.setName("11Rakesh");

       
       Laptop laptop=new Laptop();
        laptop.setId(3);
       laptop.setBrand("dell");
       laptop.setPrice("45000");
       
      
       
       st.setLaptop(laptop);
       laptop.setStudent(st);
      
       Expenses expense1=new Expenses();
       expense1.setExpense(1000);
       expense1.setId(1);
       expense1.setType("groceries");
       
       Expenses expense2=new Expenses();
       expense2.setExpense(1000);
       expense2.setId(2);
       expense2.setType("dummy");
       
       st.getExpenses().add(expense1);
       st.getExpenses().add(expense2);
       
       Configuration con= new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class).addAnnotatedClass(Expenses.class);
       SessionFactory sf =con.buildSessionFactory();
       
       Session s=sf.openSession();
       
       Transaction tx = s.beginTransaction();
       //s.save(st);
       
       
      s.save(expense1);
      s.save(expense2);
       s.save(st);
      s.save(laptop);
       tx.commit();
       
       Student s1 = s.get(Student.class, 1);
		
		System.out.println("Details of Student with id = 1");
		
		System.out.print("The expenses are ");
		for (Expenses e1: s1.getExpenses()) {
			System.out.print(e1.getType()+" , ");
		}
		
		System.out.print("The laptop owned is ");
		System.out.println(s1.getLaptop().getBrand());
	}
}
