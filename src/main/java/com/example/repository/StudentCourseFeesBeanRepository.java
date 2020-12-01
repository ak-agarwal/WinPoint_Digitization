package com.example.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winpoint.model.StudentCourseFeesBean;

@Repository
public interface StudentCourseFeesBeanRepository extends JpaRepository<StudentCourseFeesBean, Integer>{

}

