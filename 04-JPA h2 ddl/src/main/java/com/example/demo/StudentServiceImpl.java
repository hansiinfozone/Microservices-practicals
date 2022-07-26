package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentServices{

	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public Student save(Student student) {
		return studentRepository.save(student);
	}
	
	public   Student fetchStudentById(int id) {
		
				 Optional<Student> student = studentRepository.findById(id);
				 if(student.isPresent()) {
					 student.get();
				 }
				 return null;
	
	}
	
	
}
