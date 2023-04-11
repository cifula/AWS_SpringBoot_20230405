package com.web.study.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.web.study.domain.entity.Lecture;
import com.web.study.dto.request.lecture.lecture.LectureReqDto;
import com.web.study.repository.LectureRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LectureServiceImpl implements LectureService {
	
	private final LectureRepository lectureRepository;

	@Override
	public void registeLecture(LectureReqDto lectureReqDto) {
		Lecture lecture = lectureReqDto.toEntity();
		System.out.println(lecture);
		lectureRepository.saveLecture(lecture);
	}

	@Override
	public List<Lecture> getLectureAll() {
		return lectureRepository.getLectureAll();
	}

	@Override
	public Lecture findLectureById(int id) {
		return lectureRepository.findLectureById(id);
	}

}
