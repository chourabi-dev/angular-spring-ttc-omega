package com.ttcdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ttcdemo.entities.Depots;

public interface DepotRepository extends JpaRepository<Depots,Long> {

}
