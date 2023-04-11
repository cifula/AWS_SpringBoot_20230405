package com.web.study.service;

import java.util.List;

import com.web.study.domain.entity.Course;
import com.web.study.dto.request.lecture.course.CourseReqDto;

public interface CourseService {	
	public void registeCourse(CourseReqDto courseReqDto);
	public List<Course> getCourseAll();
	public Course findCourseById(int id);
}
