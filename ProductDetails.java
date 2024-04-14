package com.lamda.learning.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ProductDetails {
	
	private String name;
	
	private Long price;
	
	
public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Long getPrice() {
		return price;
	}


	public void setPrice(Long price) {
		this.price = price;
	}


public ProductDetails(String name, Long price) {
		super();
		this.name = name;
		this.price = price;
	}


public static void main(String[] args) {
	List<ProductDetails> prod=new ArrayList<ProductDetails>();
	prod.add(new ProductDetails("Vovo",20000l));
	prod.add(new ProductDetails("Oppo",23000l));
	prod.add(new ProductDetails("oni",29000l));
	List<String> names=prod.stream().filter(n->n.price>23000).map(n->n.name).collect(Collectors.toList());
	System.out.println(names);
	double value=prod.stream().collect(Collectors.summingDouble(p->p.price));
	System.out.println(value);
	ProductDetails p=prod.stream().min((p1,p2)->p1.price>p2.price?1:-1).get();
	System.out.println(p.getPrice());
	ProductDetails pro=prod.stream().max((p1,p2)->p1.price>p2.price?1:-1).get();
	System.out.println(pro.getPrice());
	System.out.println(prod.stream().count());
}
}
