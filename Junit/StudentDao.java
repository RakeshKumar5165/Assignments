package dao;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import model.Student;

public class StudentDAO {

	private  Map<Integer,Student> studentList;
	static {
		
	}
	@SuppressWarnings("deprecation")
	public StudentDAO() {
		// TODO Auto-generated constructor stub
		studentList=new HashMap<Integer,Student>();
		studentList.put(1,new Student(1, "Rakesh", "Kumar", "Bangalore", new Date(1996, 10, 10), 9811622052, 6, "ece"));
		studentList.put(2,new Student(2, "Anantha", "SN", "shimoga", new Date(1996, 12, 14), 9911023876, 4, "cs"));
		
	}

	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		if(studentList.get(student.getRollNo())!=null)
		return null;
		studentList.put(student.getRollNo(), student);
		return studentList.get(student.getRollNo());
	}

	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		if(studentList.get(student.getRollNo())==null)
			return null;
		studentList.put(student.getRollNo(), student);	
		
		return studentList.get(student.getRollNo());

	}

	public Student getStudent(int rollNo) {
		// TODO Auto-generated method stub
		if(studentList.get(rollNo)==null)
			return null;
			
		
		return studentList.get(rollNo);
	}

	

	public Student deleteStudent(int rollNo) {
		// TODO Auto-generated method stub
		if(studentList.get(rollNo)==null)
			return null;
		Student stud=studentList.remove(rollNo);
		return stud;
	}

}