package com.briz.democloud;
// THERE IS NO NEED TO CREATE A .JAR FILE JUST RUN IN COMMAND LINE CONSOLE 
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class DemocloudApplication {

	public static void main(String[] args) 
	{
		SpringApplication.run(DemocloudApplication.class, args);
	}
// Function,Consumer,Supplier are interfaces
	 @Bean // curl software is already installed otherwise install it 
	    public Function<String, String> function() {//curl http://localhost:8181/function/ranchi
	        return input -> input.toUpperCase();
	    }

	    @Bean //curl http://localhost:8181/consume/ranchi (no space in parameter note this)
	    public Consumer<String> consume() { // method as a rest end point 
	        return input -> {
	            System.err.println("Input-" + input);
	        };
	    }

	    @Bean //curl http://localhost:8181/supply
	    public Supplier<String> supply() {
	        return () -> "Hello from Supplier";
	    }
	    @Bean // note by default output will be in json format 
	    public Supplier<Book> getBook() {//>curl http://localhost:8181/getBook
	        return () -> new Book(102,"jungle book ");
	    }
	    @Bean // note by default output will be in json format 
	    //public Function<Flux<String>, Flux<String>> uppercase() use this syntax for async
	    public Supplier<Employee> getemp() throws InterruptedException //curl http://localhost:8181/getemp
	    {
	        return () -> new Employee(102,"kanchan","cashier","ranchi");
	    }
	    }

