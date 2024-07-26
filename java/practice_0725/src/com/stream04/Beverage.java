package com.stream04;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Beverage {
	private String name;
	private int price;
	private boolean isIce;
}
