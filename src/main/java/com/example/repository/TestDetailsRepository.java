package com.example.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winpoint.model.TestDetails;


@Repository
public interface TestDetailsRepository extends JpaRepository<TestDetails, Integer>{

}

