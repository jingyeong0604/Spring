package com.shinhan.section02;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


public class People {

	private String name;
	private int age;
	
	

	private Car car;
	private List<String> major;
	private List<License> licenseList;
	private Map<String, Book> books;

	
	Set<String> friend;
	Properties myprofile;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Car getCar() {
		return car;
	}

	public List<String> getMajor() {
		return major;
	}

	public List<License> getLicenseList() {
		return licenseList;
	}

	public Map<String, Book> getBooks() {
		return books;
	}

	public Set<String> getFriend() {
		return friend;
	}

	public Properties getMyprofile() {
		return myprofile;
	}

	public People() {
		System.out.println("People의 기본 생성자");
	}

	public void setFriend(Set<String> friend) {
		this.friend = friend;
	}

	public void setMyprofile(Properties myprofile) {
		this.myprofile = myprofile;
	}

	// 기본생성자는 생성자가 정의되지 않은 경우 컴파일시에 자동으로 만들어준다.
	public void setBooks(Map<String, Book> books) {
		this.books = books;
	}

	public void setName(String name) {
		System.out.println("people======SetName()");
		this.name = name;
	}

	public void setAge(int age) {
		System.out.println("people======setAge()");
		this.age = age;
	}

	public void setCar(Car car) {
		System.out.println("people======setCar()");
		this.car = car;
	}

	public void setMajor(List<String> major) {
		this.major = major;
	}

	public void setLicenseList(List<License> licenseList) {
		this.licenseList = licenseList;
	}

	@Override
	public String toString() {
		return "People [name=" + name + ", age=" + age + ", car=" + car + ", major=" + major + ", licenseList="
				+ licenseList + ", books=" + books + "]";
	}

}
