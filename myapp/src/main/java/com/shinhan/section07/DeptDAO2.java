package com.shinhan.section07;

import org.springframework.stereotype.Repository;

//Bean만들기 (스프링이 생성하고 소멸하는 것을 관리하는 객체)
//1)XML파일에 등록 : <bean id="deptDAO" class="package com.shinhan.section07"/>
//2)Annotation사용 : meta data를 사용, 가독성 좋다 @Component @Repository @Service @Controller
//context:component-scan으로 패키지를 설정한다.

@Repository("deptDAO2")
public class DeptDAO2 implements DeptDAOInterface{
	
	@Override
	public void deptAll() {
		System.out.println("모든부서의 정보를 return한다.");
	}
	
}
