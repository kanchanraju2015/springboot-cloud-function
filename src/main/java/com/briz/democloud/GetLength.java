package com.briz.democloud;

import java.util.function.Function;
//curl  localhost:8181/getLength/tatanagar (careful abouth the url)
// note the function name java style class name becomes 
public class GetLength implements Function<String, Integer> {
	    @Override
	    public Integer apply(String value) {
	        return value.length();
	    }
	}

