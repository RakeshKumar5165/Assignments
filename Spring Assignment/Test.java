package spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ){
        
    	ApplicationContext con = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeDao dao=(EmployeeDao)con.getBean("edao");
        List<Employee> elist=dao.getAllEmployeesRowMapper();  
        for(Employee e:elist)  
            System.out.println(e.getName()); 
        
        List<Employee> employee = new ArrayList<Employee>();
        Employee e1= new Employee(1,"A",3000);
        Employee e2= new Employee(2,"B",7000);
        Employee e3= new Employee(3,"C",1000);
        Employee e4= new Employee(4,"D",9000);
        Employee e5= new Employee(5,"E",2000);
        Employee e6= new Employee(6,"F",7000);
        Employee e7= new Employee(7,"G",2000);
        Employee e8= new Employee(8,"H",7000);
        Employee e9= new Employee(9,"I",1000);
        Employee e10= new Employee(10,"J",4000);
        employee.add(e1);
        employee.add(e2);
        employee.add(e3);
        employee.add(e4);
        employee.add(e5);
        employee.add(e6);
        employee.add(e7);
        employee.add(e8);
        employee.add(e3);
        employee.add(e9);
        employee.add(e10);
        dao.insertList(employee);
    }
}

