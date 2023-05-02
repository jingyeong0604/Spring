package com.shinhan.section01;

public class TVFactory {
	
	public static TV makeTV(String brand) {
		if(brand.equals("sam")) {
			return new SamsungTV();
		}else if(brand.equals("lg")) {
			//return new LgTV();
		}else 
			return null;
		return null;
	}
}
//공장의 역할을 Spring이 한다.