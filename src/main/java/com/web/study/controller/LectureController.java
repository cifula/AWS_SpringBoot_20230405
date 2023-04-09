package com.web.study.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.study.dto.ResponseDto;
import com.web.study.dto.request.lecture.LectureRegisteReqDto;
import com.web.study.dto.request.lecture.LectureReqDto;
import com.web.study.dto.request.lecture.LecturerReqDto;
import com.web.study.dto.request.lecture.StudentReqDto;
import com.web.study.service.LectureService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class LectureController {
	
	private final LectureService lectureService;
	
	// Create
	@PostMapping("/lecture")
	public ResponseEntity<? extends ResponseDto> register(@RequestBody LectureReqDto lectureReqDto) {
		
		lectureService.registeLecture(lectureReqDto);
		
		return ResponseEntity.ok().body(ResponseDto.ofDefault());
	}
	
	@PostMapping("/lecturer")
	public ResponseEntity<? extends ResponseDto> register(@RequestBody LecturerReqDto lecturerReqDto) {
		
		lectureService.registeLecturer(lecturerReqDto);
		
		return ResponseEntity.ok().body(ResponseDto.ofDefault());
	}
	
	@PostMapping("/student")
	public ResponseEntity<? extends ResponseDto> register(@RequestBody StudentReqDto studentReqDto) {
		
		lectureService.registeStudent(studentReqDto);
		
		return ResponseEntity.ok().body(ResponseDto.ofDefault());
	}
	
	@PostMapping("/registe")
	public ResponseEntity<? extends ResponseDto> register(@RequestBody LectureRegisteReqDto lectureRegisteDto) {
		
		System.out.println(lectureRegisteDto);

		lectureService.registeLectureRegiste(lectureRegisteDto);
		
		return ResponseEntity.ok().body(ResponseDto.ofDefault());
	}
	
	// Read
	public ResponseEntity<? extends ResponseDto> get() {
		
		return ResponseEntity.ok().body(ResponseDto.ofDefault());
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
