package com.watcher.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CartDto {
	
	private int cartId;
	private double totalPrice;
	private List<ProductDto> product = new ArrayList<>();
}
