package com.bihuniak.educator;

import com.bihuniak.educator.Company.Department;
import com.bihuniak.educator.Company.DepartmentRepository;
import com.bihuniak.educator.Company.Employee;
import com.bihuniak.educator.Company.EmployeeRepository;
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
	@Autowired
	private DepartmentRepository departmentRepository;
	@Autowired
	private EmployeeRepository employeeRepository;
//	@Autowired
//	private HumanRepository humanRepository;
	public static void main(String[] args) {
		SpringApplication.run(EducatorApplication.class, args);
	}

	@PostConstruct
	public void init() {
//		BuildingNumber BuildingNubmer1 = new BuildingNumber(2, 8);
//		Adress Adress1 = new Adress("Wagonowa", "Wroclaw", "Poland","52-200");
//		List<String> phone1 = new ArrayList<>();
//		phone1.add("Xiaomi");
//		Human Human1 = new Human("Janusz", "Kowalski", Sex.MALE, LocalDate.of(1975, 10, 15), Adress1, phone1);
//		humanRepository.save(Human1);
//
		Department department = new Department("Marketing","Wroclaw", 5);

		Employee employee1 = new Employee("Develop", "Kazik Woźniak");
		Employee employee2 = new Employee("Marketer", "Marsell Extasy");
		Employee employee3 = new Employee("Just badass", "Adamo Truchanov");
		Employee employee4 = new Employee("Cleaner", "Marta Kucyk");

		department.setEmployee(asList(employee1,employee2,employee3,employee4));
		departmentRepository.save(department);
//		System.out.println(departmentRepository.findById(4L).get());
//		System.out.println(employeeRepository.findById(3L).get());

	}
}
