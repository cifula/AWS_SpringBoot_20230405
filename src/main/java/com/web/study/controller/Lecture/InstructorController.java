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
import com.web.study.dto.request.lecture.instructor.InstructorReqDto;
import com.web.study.dto.response.lecture.instructor.InstructorRespDto;
import com.web.study.service.InstructorService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class InstructorController {
	
	private final InstructorService instructorService;
	
	// Create
	@PostMapping("/instructor")
	public ResponseEntity<? extends ResponseDto> register(@RequestBody InstructorReqDto instructorReqDto) {
		
		instructorService.registeInstructor(instructorReqDto);
		
		return ResponseEntity.ok().body(ResponseDto.ofDefault());
	}

	// Read
	@GetMapping("/instructors")
	public List<InstructorRespDto> getInstructors() {
		List<InstructorRespDto> dtos = new ArrayList<>();
		instructorService.getInstructorAll().forEach(entity -> {
			dtos.add(entity.toDto());
		});
		
		return dtos;
	}
	
	@GetMapping("/instructor/{id}")
	public InstructorRespDto getInstructorById(@PathVariable int id) {
		
		return instructorService.findInstructorById(id).toDto();
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
