package com.akshay.ObjMapperPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MyMain {

	public static void main(String[] args) {
		ResponceObj resp = ResponceObj.createObj();
		System.out.println("### created resp object is : " + resp.toString());
		ObjectMapper mapper = new ObjectMapper();
		String responceObjStr = "";
		try {
			responceObjStr = mapper.writeValueAsString(resp);
			System.out.println("### creted JSON str is :"+ responceObjStr);
			Map<String, Object> responceMap =  mapper.readValue(responceObjStr, new TypeReference<Map<String,Object>>() {
			});
			System.out.println("### statuscode from mapped obj is :" + responceMap.get("statusCode"));
			ArrayList<CustomerObj> ls =(ArrayList<CustomerObj>) responceMap.get("customers");
			//mapper.
			System.out.println("### customerObj from map is " + ls.toString());
			List<CustomerObj> lst = mapper.convertValue(responceMap.get("customers"), new TypeReference<ArrayList<CustomerObj>>() { });
			//ArrayList<CustomerObj> lst = mapper.convertValue(ls, null)
			for(int i=0; i < lst.size() ; i++) {
				System.out.println(ls.get(i).getAccountId());
			}
			
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
	}

}
