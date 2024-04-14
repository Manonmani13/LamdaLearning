package com.lamda.learning.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MinMax {
	String name;
	
	Long id;
	
public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
public MinMax(String name, Long id) {
		super();
		this.name = name;
		this.id = id;
	}

public static void main(String[] args) {
	List<MinMax> list=new ArrayList<MinMax>();
	list.add(new MinMax("Mano",12l));
	list.add(new MinMax("Naveen",14l));
	list.add(new MinMax("Mano",12l));

	Set<String> ls =list.stream().map(l->l.name).collect(Collectors.toSet());
	System.out.println(ls);
}
}
