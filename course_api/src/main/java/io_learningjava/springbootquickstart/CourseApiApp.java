package io_learningjava.springbootquickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//This annotation tells spring boot that this is the starting point of a spring boot application
@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//calling a static method to run this spring boot application
		//The class with the main is passed as the first argument
		//Second argument is the parameters that are to be passed to the main function.
		SpringApplication.run(CourseApiApp.class, args);
		//This will create a server container and does all the required work that is needed 
		//to run the application.
		

	}

}
