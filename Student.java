package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName() {
		System.out.println("Student Name");
	}
	public void studentDept() {
		System.out.println("Student Department");
	}
	public void studentId() {
		System.out.println("Student Id");
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.departmentName();
		s.studentName();
		s.studentDept();
		s.studentId();
	}
}
