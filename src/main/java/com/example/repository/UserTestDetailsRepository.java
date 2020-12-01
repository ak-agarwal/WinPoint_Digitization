package com.example.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winpoint.model.UserTestDetails;


@Repository
public interface UserTestDetailsRepository extends JpaRepository<UserTestDetails, Integer>{

}


