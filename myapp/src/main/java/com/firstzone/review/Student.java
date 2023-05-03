package com.firstzone.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component("my") //Spring Bean으로 만들기
@ToString
@Getter
//@AllArgsConstructor
@Setter
public class Student {
	private String studentId;
	private String studentName;
	private String major;
	
	@Autowired //autowired는 반드시 만들어서 넣어줘야함
	private Address addr;
	
	public Student() {
		System.out.println("student의 NoArgsConstructor>>>>getBean할때 지나감");
	}

	public Student(String studentId, String studentName, String major) {
		System.out.println("Student AllArgsConstructor");
		this.studentId = studentId;
		this.studentName = studentName;
		this.major = major;
	}
	
}
