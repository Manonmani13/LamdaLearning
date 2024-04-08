package com.lamda.learning;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LamdaUsingSort {
	
	private String phoneName;
	
	private Long amount;
	
public String getPhoneName() {
		return phoneName;
	}

	public void setPhoneName(String phoneName) {
		this.phoneName = phoneName;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}
	
	

public LamdaUsingSort(String phoneName, Long amount) {
		super();
		this.phoneName = phoneName;
		this.amount = amount;
	}

public static void main(String[] args) {
	List<LamdaUsingSort> obj=new ArrayList<LamdaUsingSort>();
	obj.add(new LamdaUsingSort("sam",20000l));
	obj.add(new LamdaUsingSort("oppo",24000l));
	obj.add(new LamdaUsingSort("vivo",10000l));

	Stream<LamdaUsingSort>ls= obj.stream().filter(n->n.amount>10000);
	ls.forEach(l->{
		System.out.println(l.phoneName +" "+l.amount);
	
	});
}
}
