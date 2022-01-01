package com.example.unimalb.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class StudentService {
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
