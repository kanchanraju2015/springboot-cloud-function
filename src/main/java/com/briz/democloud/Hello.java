package com.briz.democloud;
//  THIS IS CLASSNAME AS REST ENDPOINT 
import java.util.function.Function;
//curl  localhost:8181/hello/chandu  try this case sensitive only small letters
public class Hello implements Function<String, String> {
		@Override
		public String apply(String s) {
		return "Hello " + s + ", and welcome to Server less world!!!";
		}
		}
	
	
