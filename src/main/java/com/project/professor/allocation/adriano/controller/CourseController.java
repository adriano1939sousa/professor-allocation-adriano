package com.project.professor.allocation.adriano.controller;

import com.project.professor.allocation.adriano.service.CourseService;

public class CourseController {

    private CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }
}