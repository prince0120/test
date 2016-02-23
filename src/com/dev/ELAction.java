package com.dev;

import java.util.ArrayList;



public class ELAction {
	
	private ArrayList <String>list;
	public String listIterator(){
		list=new ArrayList<String>();
		list.add("Prince Aajayau");
		list.add("Neha");
		list.add("Ajay");
		return "success";
	}
	public ArrayList<String> getList() {
		return list;
	}
	public void setList(ArrayList<String> list) {
		this.list = list;
	}
	

}
