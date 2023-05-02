package com.shinhan.section07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service("deptService") //@Component + Service 역할
public class DeptService {
	
	@Autowired //의존관계가 강하다 : DeptDAO deptDAO=new DeptDAO()
	//작성위치는 : filed(가장 일반적), 생성자, setter모두 가능함.
	//타입같으면 자동주입
	
	//같은타입이 여러개있다면 이름으로 설정함...interface 구현한 경우 
	@Qualifier("deptDAO2")
	DeptDAOInterface dao;
	//type같으면 자동 주입
	//같은 타입이 여러개있다면 이름 설정...interface구현한 경우
		
	
	public void work() {
		dao.deptAll();
	}
	
	
}
