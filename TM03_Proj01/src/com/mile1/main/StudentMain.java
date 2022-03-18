package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.exception.*;
import com.mile1.service.*;

public class StudentMain {
	static Student Data[] = new Student[10];
	static {
			for(int i=0;i<10;i++) {
				Data[i]=new Student();
			}
			Data[0]=new Student("A1",new int[] {72,73,74});
			Data[1]=new Student("B1",new int[] {75,76,77});
			Data[2]=new Student("C1",new int[] {99,99,99});
			Data[3]=new Student("C3",new int[] {100,100,99});
			Data[4]=new Student("B2",new int[] {13,88,13});
			Data[5]=new Student("C3",new int[] {14,14,99});
			Data[6]=new Student("A2",new int[] {77,55,12});
			Data[7]=new Student(null,new int[] {13,88,13});
			Data[8]=new Student("A2",null);
			Data[9]=null;
	}
	public static void main(String[] args) throws NullNameException, NullStudentObjectException,NullMarksArrayException {
		// TODO Auto-generated method stub
		StudentReport SR=new StudentReport();
		StudentService SS= new StudentService();
		
		System.out.println("Grade Calculation");
		String x=null;
		for(int i=0;i<Data.length;i++) {
			try {
				x=SR.Validate(Data[i]);
			}
			catch(NullMarksArrayException e) {
				System.out.println(e);
				continue;
			}
			catch(NullNameException e) {
				System.out.println(e);
				continue;
			}
			catch(NullStudentObjectException e) {
				System.out.println(e);
				continue;
			}
			System.out.println("Grade: "+x);
		}
		 System.out.println("Number of Null marks= "+SS.findNumberOfNullMarksArray(Data));
		 System.out.println("Number of Null Object= "+SS.findNumberOfNullObjects(Data));
		 System.out.println("Number of Null name= "+SS.findNumberOfNullNames(Data));
	}
}
