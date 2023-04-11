package com.web.study.dto.request.lecture.student;

import java.time.LocalDate;

import com.web.study.domain.entity.Student;

import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class StudentReqDto {
	private String studentName;
	private LocalDate birthDate;
	
	public Student toEntity() {
		return Student.builder()
				.sdm_name(studentName)
				.sdm_birth(birthDate)
				.build();
	}
}
