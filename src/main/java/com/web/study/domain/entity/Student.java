package com.web.study.domain.entity;

import java.time.LocalDate;

import com.web.study.dto.response.lecture.student.StudentRespDto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Student {
	private int sdm_id;
	private String sdm_name;
	private LocalDate sdm_birth;

	public StudentRespDto toDto() {
		return StudentRespDto.builder()
				.id(sdm_id)
				.studentName(sdm_name)
				.birthDate(sdm_birth)
				.build();
	}
}
