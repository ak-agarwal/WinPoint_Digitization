package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winpoint.model.ClientCategory;

@Repository
public interface ClientCategoryRepository extends JpaRepository<ClientCategory, Integer>{

}
