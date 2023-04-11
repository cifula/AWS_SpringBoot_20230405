package com.web.study.service;

import java.util.List;

import com.web.study.domain.entity.Student;
import com.web.study.dto.request.lecture.student.StudentReqDto;

public interface StudentService {

	public void registeStudent(StudentReqDto studentReqDto);
	public List<Student> getStudentAll();
	public Student findStudentById(int id);
}
