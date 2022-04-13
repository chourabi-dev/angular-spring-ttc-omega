package com.ttcgroupdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ttcgroupdemo.entities.Vehicule;

public interface VehiculeRepository extends JpaRepository<Vehicule,Long> {

}
