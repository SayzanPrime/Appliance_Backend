package com.example.appliance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.appliance.model.Appliance;

public interface ApplianceRepository extends JpaRepository<Appliance, Long>{

}
