package com.shinhan.section03;

public class EmpService {
	EmpDAO dao;
	
	
	//1.생성자를 통해서 injection하기
	public EmpService(EmpDAO dao) {
		this.dao=dao;
	}
	
	//2.setter를 통해서 injection하기
	public EmpService() {
		System.out.println("EmpService default 생성자");
	}
	 
	public void setDao(EmpDAO dao) {
		this.dao = dao;
	}
	
	public void empAll() {
		dao.selectAll();
	}
	
}
