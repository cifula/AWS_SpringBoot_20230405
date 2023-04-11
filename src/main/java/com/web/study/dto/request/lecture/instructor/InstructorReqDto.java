package com.web.study.dto.request.lecture.instructor;

import java.time.LocalDate;

import com.web.study.domain.entity.Instructor;

import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class InstructorReqDto {
	private String instructorName;
	private LocalDate birthDate;
	
	public Instructor toEntity() {
		return Instructor.builder()
				.itm_name(instructorName)
				.itm_birth(birthDate)
				.build();
	}
}
