package com.shinhan.section04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Component이면서 service

@Service("empSer")
public class EmpService {
	
	@Autowired
	EmpDAO dao;
	//타입이 같으면 자동으로 주입한다.
	
	/*
	 * //1.생성자를 통해서 injection하기 public EmpService(EmpDAO dao) { this.dao=dao; }
	 * 
	 * //2.setter를 통해서 injection하기 public EmpService() {
	 * System.out.println("EmpService default 생성자"); }
	 * 
	 * public void setDao(EmpDAO dao) { this.dao = dao; }
	 */
	
	public void empAll() {
		dao.selectAll();
	}
	
}
