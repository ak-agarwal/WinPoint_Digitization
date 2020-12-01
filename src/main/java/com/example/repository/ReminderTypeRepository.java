package com.example.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winpoint.model.ReminderType;

@Repository
public interface ReminderTypeRepository extends JpaRepository<ReminderType, Integer>{

}