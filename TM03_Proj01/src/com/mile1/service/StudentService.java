package com.mile1.service;

import com.mile1.bean.Student;

public class StudentService {
	public int findNumberOfNullMarksArray(Student s[]) {
		int Count_null_marks=0;
		for(int i=0;i<s.length;i++) {
			if(s[i]!=null) {
				if(s[i].getMarks()==null) {
					Count_null_marks+=1;
				}
			}
		}
		return Count_null_marks;
	}
	public int findNumberOfNullNames(Student s[]) {
		int CountNullNames=0;
		for(int i=0;i<s.length;i++) {
			if(s[i]!=null) {
				if(s[i].getName()==null) {
					CountNullNames+=1;
				}
			}
		}
		return CountNullNames; 
	}
	public int findNumberOfNullObjects(Student s[]) {
		int CountNullObjects=0;
		for(int i=0;i<s.length;i++) {
			if(s[i]==null) {
				CountNullObjects+=1;
			}
		}
		return CountNullObjects; 
	}
}
