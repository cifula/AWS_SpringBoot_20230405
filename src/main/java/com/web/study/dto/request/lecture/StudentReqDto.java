package com.web.study.dto.request.lecture;

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
				.student_name(studentName)
				.birth_date(birthDate)
				.build();
	}
}
