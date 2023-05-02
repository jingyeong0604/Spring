package com.shinhan.section05;

import org.springframework.stereotype.Component;

//Bean(Spring은 객체를 Bean이라고 한다) Car c1 = new Car()
//POJO(Plain Old Java Object)
//DTO(Data Transfer Object)
//VO(Value Object)

@Component("myCar")
public class Car {
	private String model="ABC";
	private int price = 1000;
	
	public Car() {
		System.out.println("car의 default 생성자");
	}
	
	public Car(String model, int price) {
		System.out.println("car의 argument 2개 생성자");
		this.model = model;
		this.price = price;
	}
	
	public String getModel() {
		System.out.println("car-------getModel()");
		return model;
	}
	
	public void setModel(String model) {
		System.out.println("car-------setModel()");
		this.model = model;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Car [model=" + model + ", price=" + price + "]";
	}
	
	
}
