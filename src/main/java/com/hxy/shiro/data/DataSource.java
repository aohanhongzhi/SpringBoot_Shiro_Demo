package com.hxy.shiro.data;

import java.util.HashMap;

public class DataSource {
	
	public static HashMap<String, HashMap> getData(){
		HashMap<String, HashMap> hashMap = new HashMap<>();
		
		HashMap<String, Object> details = new HashMap<>();
		details.put("password", "admin");
		details.put("role", "admin");
		details.put("permission", "view");
		
		hashMap.put("admin", details);
		
		
		return hashMap;
		
	}

}
