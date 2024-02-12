package com.watcher.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.Size;
@Entity
@Data
@Table(name = "payments")
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

	@OneToOne(mappedBy = "payment", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	private Order order;

//	@NotBlank
//	@Size(min = 4, message = "Payment method must contain atleast 4 characters")
	private String paymentMethod;
}
