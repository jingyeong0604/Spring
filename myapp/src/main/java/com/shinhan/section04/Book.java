package com.shinhan.section04;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Component//<bean id="Book" class=" com.shinhan.section04.Book"/>
public class Book {
	private String title;
	private int price;
	private String kind;
	

	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + ", kind=" + kind + "]";
	}
	
	
}
