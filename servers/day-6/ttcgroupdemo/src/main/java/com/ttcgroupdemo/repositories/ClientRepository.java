package com.ttcgroupdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ttcgroupdemo.entities.Clients;

public interface ClientRepository extends JpaRepository<Clients,Long> {

}
