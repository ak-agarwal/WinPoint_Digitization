package com.example.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winpoint.model.ToolTips;


@Repository
public interface ToolTipsRepository extends JpaRepository<ToolTips, Integer>{

}


