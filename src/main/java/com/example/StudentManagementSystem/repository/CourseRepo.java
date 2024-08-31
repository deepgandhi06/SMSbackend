package com.example.StudentManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.StudentManagementSystem.entity.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course , Integer> {
	
}
