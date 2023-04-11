package com.web.study.dto.response.lecture.lecture;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class LectureRespDto {
	private int id;
	private String lectureName;
	private int lecturePrice;
	private int instructorId;
}
