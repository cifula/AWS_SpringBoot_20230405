package com.web.study.dto.request.lecture;

import java.time.LocalDate;

import com.web.study.domain.entity.Lecturer;

import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class LecturerReqDto {
	private String lecturerName;
	private LocalDate birthDate;
	
	public Lecturer toEntity() {
		return Lecturer.builder()
				.lecturer_name(lecturerName)
				.birth_date(birthDate)
				.build();
	}
}
