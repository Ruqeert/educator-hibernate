package com.bihuniak.educator;

import com.bihuniak.educator.basic.Car;
import com.bihuniak.educator.basic.MyFirstRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

import static java.util.Arrays.asList;

@SpringBootApplication
public class EducatorApplication {

	@Autowired
	private MyFirstRepository myFirstRepository;

	public static void main(String[] args) {
		SpringApplication.run(EducatorApplication.class, args);
	}

	@PostConstruct
	public void init() {
//		Car car1 = new Car("Lamborghini","Aventador", 5.6,  4, false);
//		Car car2 = new Car("Lamborghini","Gallardo", 5.6,  4, false);
//		Car car3 = new Car("Lamborghini","Huracane", 5.6,  4, false);
//		Car car4 = new Car("Lamborghini","LX-5", 5.6,  4, false);



//		myFirstRepository.saveAll(asList(car1, car2, car3, car4));
		Car car = myFirstRepository.findById(4L).get();
		System.out.println(car);
	}
}
