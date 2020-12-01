package com.example.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winpoint.model.Organization;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Integer>{

}

