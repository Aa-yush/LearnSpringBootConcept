package com.mavendemo.springcore;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	private int studentId;
	private List<String> studentPhone;
	private Set<String> studentName;
	private Map<String, String> studentCourses;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public List<String> getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(List<String> studentPhone) {
		this.studentPhone = studentPhone;
	}

	public Set<String> getStudentName() {
		return studentName;
	}

	public void setStudentName(Set<String> studentName) {
		this.studentName = studentName;
	}

	public Map<String, String> getStudentCourses() {
		return studentCourses;
	}

	public void setStudentCourses(Map<String, String> studentCourses) {
		this.studentCourses = studentCourses;
	}

	public Student(int studentId, List<String> studentPhone, Set<String> studentName,
			Map<String, String> studentCourses) {
		super();
		this.studentId = studentId;
		this.studentPhone = studentPhone;
		this.studentName = studentName;
		this.studentCourses = studentCourses;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentPhone=" + studentPhone + ", studentName=" + studentName
				+ ", studentCourses=" + studentCourses + "]";
	}

}
