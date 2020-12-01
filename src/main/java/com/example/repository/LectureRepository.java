package com.example.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winpoint.model.Lecture;


@Repository
public interface LectureRepository extends JpaRepository<Lecture, Integer>{

}


