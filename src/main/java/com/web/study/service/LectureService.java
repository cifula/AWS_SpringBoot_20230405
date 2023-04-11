package com.web.study.service;

import java.util.List;

import com.web.study.domain.entity.Lecture;
import com.web.study.dto.request.lecture.lecture.LectureReqDto;

public interface LectureService {

	public void registeLecture(LectureReqDto lectureReqDto);
	public List<Lecture> getLectureAll();
	public Lecture findLectureById(int id);
}
