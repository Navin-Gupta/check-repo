package com.training.test_unit_spring;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService {

	private List<Student> students;
	
	public StudentServiceImpl() {
		this.students=new ArrayList<Student>();
		this.students.add(new Student(1,"First", "first@mail.com", "12345"));
		this.students.add(new Student(2,"Second", "second@mail.com", "23456"));
		this.students.add(new Student(3,"Third", "third@mail.com", "34567"));
		this.students.add(new Student(4,"Fourth", "fourth@mail.com", "45678"));
	}
	
	public String getStudentContact(int id) {
		// TODO Auto-generated method stub
		  Student student= this.students.get(id-1);
		  return student.getContact();
	}

	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		if(id >=1 && id <=this.students.size())
			return this.students.get(id-1);
		return null;
	}

}
