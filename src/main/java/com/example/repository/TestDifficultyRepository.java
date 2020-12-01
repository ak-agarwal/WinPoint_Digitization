package com.example.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winpoint.model.TestDifficulty;


@Repository
public interface TestDifficultyRepository extends JpaRepository<TestDifficulty, Integer>{

}


