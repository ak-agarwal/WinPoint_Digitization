package com.example.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winpoint.model.PaymentMode;


@Repository
public interface PaymentModeRepository extends JpaRepository<PaymentMode, Integer>{

}


