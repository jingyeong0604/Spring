package com.firstzone.review;

import org.springframework.stereotype.Component;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@ToString
@NoArgsConstructor
@Setter
public class Address {
	String city;
	String zipNum;
	
}
