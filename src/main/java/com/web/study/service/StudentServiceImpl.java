package com.web.study.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.web.study.domain.entity.Student;
import com.web.study.dto.request.lecture.student.StudentReqDto;
import com.web.study.repository.StudentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
	
	private final StudentRepository studentRepository;


	@Override
	public void registeStudent(StudentReqDto studentReqDto) {
		Student student = studentReqDto.toEntity();
		studentRepository.saveStudent(student);
	}


	@Override
	public List<Student> getStudentAll() {
		return studentRepository.getStudentAll();
	}


	@Override
	public Student findStudentById(int id) {
		return studentRepository.findStudentById(id);
	}

}
