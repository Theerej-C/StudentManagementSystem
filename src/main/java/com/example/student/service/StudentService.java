package com.example.student.service;
import java.util.*;
import com.example.student.entity.Student;
public interface StudentService {

	List<Student> getAllStudent();
	Student saveStudent(Student student);
	Student getStudentById(Long id);
	Student updateStudent(Student student);
	void deleteStudentByid(Long id);
}
