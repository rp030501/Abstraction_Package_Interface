package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;

public class StudentReport {
	public String findGrades(Student studentObject) {
		int[] check=studentObject.getMarks();
		int marks=0;
		for(int i=0;i<check.length;i++) {
			if(check[i]<35) {
				return "F";
			}
			marks=marks+check[i];
		}
		if(marks<=150) {
			return "C";
		}
		else if(marks<=200 && marks>150) {
			return "B";
		}
		else if(marks<=250 && marks>200) {
			return "A";
		}
		else {
			return "A+";
		}
	}
	public String Validate(Student s) throws NullMarksArrayException, NullNameException,NullStudentObjectException {
		if(s==null) {
			throw new NullStudentObjectException();
		}
		if(s.getName() == null) {
				throw new NullNameException();
			}
		if(s.getMarks() ==null) {
				throw new NullMarksArrayException();
			}
		
		return findGrades(s);
		
	}
	

}
