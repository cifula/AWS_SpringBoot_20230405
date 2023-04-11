package com.web.study.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.web.study.domain.entity.Instructor;
import com.web.study.dto.request.lecture.instructor.InstructorReqDto;
import com.web.study.repository.InstructorRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class InstructorServiceImpl implements InstructorService {
	
	private final InstructorRepository instructorRepository;

	@Override
	public void registeInstructor(InstructorReqDto instructorReqDto) {
		Instructor instructor = instructorReqDto.toEntity();
		instructorRepository.saveInstructor(instructor);
		
	}

	@Override
	public List<Instructor> getInstructorAll() {
		return instructorRepository.getInstructorAll();
	}

	@Override
	public Instructor findInstructorById(int id) {
		return instructorRepository.findInstructorById(id);
	}

}
