package com.ttcdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ttcdemo.entities.Clients;

public interface ClientsRepository extends JpaRepository<Clients,Long> {

}
