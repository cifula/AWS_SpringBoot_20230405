package com.web.study.service;

import java.util.List;

import com.web.study.domain.entity.Instructor;
import com.web.study.dto.request.lecture.instructor.InstructorReqDto;

public interface InstructorService {

	public void registeInstructor(InstructorReqDto instructorReqDto);

	public List<Instructor> getInstructorAll();
	
	public Instructor findInstructorById(int id);
}
