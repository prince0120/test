package com.dev;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.json.JSONArray;
import org.json.JSONObject;

public class Hello implements ServletRequestAware,ServletResponseAware {
	ServletRequest request;
	ServletResponse response;
	public void greet(){
		
		System.out.println("Hello");
		try {
			PrintWriter out=response.getWriter();
			JSONObject message=new JSONObject();
			message.put("success","Request Successfullt done");
			JSONArray list=new JSONArray();
			list.put("Prince");
			list.put("Raju");
			list.put("Prince");
			list.put("Prince");
			message.put("list",list);
			
			out.print(message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		
		this.request=request;
		
	}

	@Override
	public void setServletResponse(HttpServletResponse response) {
		// TODO Auto-generated method stub
		this.response=response;
	}
	
}
