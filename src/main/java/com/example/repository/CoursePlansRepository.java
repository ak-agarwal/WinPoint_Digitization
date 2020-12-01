package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winpoint.model.CoursePlans;

@Repository
public interface CoursePlansRepository extends JpaRepository<CoursePlans, Integer>{

}
