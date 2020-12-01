package com.example.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winpoint.model.UserStudent;


@Repository
public interface UserStudentRepository extends JpaRepository<UserStudent, Integer>{

}


