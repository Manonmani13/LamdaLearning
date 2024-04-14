package com.lamda.learning.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertToMap {

	private String name;
	
	private String number;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	public ConvertToMap(String name, String number) {
		super();
		this.name = name;
		this.number = number;
	}

	public static void main(String[] args) {
		List<ConvertToMap> map=new ArrayList<ConvertToMap>();
		map.add(new ConvertToMap("Manonmani","894893458934"));
		map.add(new ConvertToMap("naveen", "9834234234"));
		Map<String,String> model=map.stream().collect(Collectors.toMap(p->p.name, p->p.number));
		System.out.println(model);
		List<String> ls=map.stream().map(ConvertToMap::getNumber).collect(Collectors.toList());
		System.out.println(ls);
	}
}
