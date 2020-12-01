package com.example.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winpoint.model.FacultySkills;


@Repository
public interface FacultySkillsRepository extends JpaRepository<FacultySkills, Integer>{

	}

