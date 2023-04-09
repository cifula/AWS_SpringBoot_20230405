package com.web.study.service;

import org.springframework.stereotype.Service;

import com.web.study.domain.entity.Lecture;
import com.web.study.domain.entity.LectureRegiste;
import com.web.study.domain.entity.Lecturer;
import com.web.study.domain.entity.Student;
import com.web.study.dto.request.lecture.LectureRegisteReqDto;
import com.web.study.dto.request.lecture.LectureReqDto;
import com.web.study.dto.request.lecture.LecturerReqDto;
import com.web.study.dto.request.lecture.StudentReqDto;
import com.web.study.repository.LectureRegisteRepository;
import com.web.study.repository.LectureRepository;
import com.web.study.repository.LecturerRepository;
import com.web.study.repository.StudentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LectureServiceImpl implements LectureService {
	
	private final LectureRepository lectureRepository;
	private final LecturerRepository lecturerRepository;
	private final StudentRepository studentRepository;
	private final LectureRegisteRepository lectureRegisteRepository;

	@Override
	public void registeLecture(LectureReqDto lectureReqDto) {
		Lecture lecture = lectureReqDto.toEntity();
		System.out.println(lecture);
		lectureRepository.registe(lecture);
	}

	@Override
	public void registeLecturer(LecturerReqDto lecturerReqDto) {
		Lecturer lecturer = lecturerReqDto.toEntity();
		lecturerRepository.registe(lecturer);
		
	}

	@Override
	public void registeStudent(StudentReqDto studentReqDto) {
		Student student = studentReqDto.toEntity();
		studentRepository.registe(student);
		
	}

	@Override
	public void registeLectureRegiste(LectureRegisteReqDto lectureRegisteReqDto) {
		LectureRegiste lectureRegiste = lectureRegisteReqDto.toEntity();
		lectureRegisteRepository.registe(lectureRegiste);
		
	}
	
	
	

}
