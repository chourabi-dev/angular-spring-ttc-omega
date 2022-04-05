package com.ttcgroupdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ttcgroupdemo.entities.Produits;

public interface ProduitsRepository extends JpaRepository<Produits,Long> {

}
