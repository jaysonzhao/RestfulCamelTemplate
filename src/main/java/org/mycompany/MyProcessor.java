package org.mycompany;

import java.util.Map;

import org.apache.camel.Body;

public class MyProcessor {
	public String process(@Body Map<String,String> name) {
		 return "Hello " + name.get("name");
		 }
}
