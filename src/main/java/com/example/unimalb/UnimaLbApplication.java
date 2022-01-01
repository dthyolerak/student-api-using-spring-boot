package com.example.unimalb;

import com.example.unimalb.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class UnimaLbApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnimaLbApplication.class, args);
	}
		@GetMapping
		public static List<Student> getStudents(){
			return List.of(
					new Student(
							1L,
							"Donnex Thyolera Kamsonga",
							"bed-com-15-19",
							"bed-com-15-19@unima.ac.mw",
							"upkeep",
							true,
							LocalDate.of(2019, Month.AUGUST,4),
							"hello"
					)
			);
		}
}
