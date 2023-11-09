package com.testExercise.ex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//ВВедите в адресной строке http://localhost:8080/counts/   -  далее введите любой текст для подсчета
// Например http://localhost:8080/counts/ansdjaknsdasnkd
@SpringBootApplication
public class ExApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExApplication.class, args);
	}

}
