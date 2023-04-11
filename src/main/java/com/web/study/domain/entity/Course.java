package com.web.study.domain.entity;

import java.time.LocalDate;

import com.web.study.dto.response.lecture.course.CourseRespDto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Course {
	private int csm_id;
	private int ltm_id;
	private int sdm_id;
	private LocalDate registe_date;
	private Lecture lecture;
	private Student student;
}
