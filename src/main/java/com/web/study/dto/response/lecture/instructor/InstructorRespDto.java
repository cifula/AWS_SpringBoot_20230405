package com.web.study.dto.response.lecture.instructor;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class InstructorRespDto {
	private int id;
	private String instructorName;
	private LocalDate birthDate;
}
