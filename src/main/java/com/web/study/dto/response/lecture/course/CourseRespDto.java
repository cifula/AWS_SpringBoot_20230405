package com.web.study.dto.response.lecture.course;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class CourseRespDto {
	private int id;
	private int lectureId;
	private int studentId;
	private LocalDate registeDate;
}
