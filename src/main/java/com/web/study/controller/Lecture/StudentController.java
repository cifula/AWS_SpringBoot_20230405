package com.web.study.controller.Lecture;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.study.dto.ResponseDto;
import com.web.study.dto.request.lecture.student.StudentReqDto;
import com.web.study.dto.response.lecture.student.StudentRespDto;
import com.web.study.service.StudentService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class StudentController {
	
	private final StudentService studentService;
	
	// Create
	@PostMapping("/student")
	public ResponseEntity<? extends ResponseDto> register(@RequestBody StudentReqDto studentReqDto) {
		
		studentService.registeStudent(studentReqDto);
		
		return ResponseEntity.ok().body(ResponseDto.ofDefault());
	}

	
	// Read
	@GetMapping("/students")
	public List<StudentRespDto> getStudentAll() {
		List<StudentRespDto> dtos = new ArrayList<>();
		studentService.getStudentAll().forEach(entity -> {
			dtos.add(entity.toDto());
		});
		return dtos;
	}
	
	@GetMapping("/student/{id}")
	public StudentRespDto getStudentById(@PathVariable int id) {
		return studentService.findStudentById(id).toDto();
	}
	
	// Update
	public ResponseEntity<? extends ResponseDto> modify() {
		
		return ResponseEntity.ok().body(ResponseDto.ofDefault());
	}
	
	// Delete
	public ResponseEntity<? extends ResponseDto> remove() {
		
		return ResponseEntity.ok().body(ResponseDto.ofDefault());
	}
}
