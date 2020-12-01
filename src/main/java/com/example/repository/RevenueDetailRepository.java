package com.example.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winpoint.model.RevenueDetail;

@Repository
public interface RevenueDetailRepository extends JpaRepository<RevenueDetail, Integer>{

}


