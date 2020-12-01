package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winpoint.model.BatchDetails;


@Repository
public interface BatchDetailsRepository extends JpaRepository<BatchDetails, Integer> {

}
