package com.ttcgroupdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ttcgroupdemo.entities.Interventions;

public interface InterventionsRespository extends JpaRepository<Interventions, Long> {

}
