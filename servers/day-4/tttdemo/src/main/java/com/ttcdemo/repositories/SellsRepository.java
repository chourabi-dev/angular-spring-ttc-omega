package com.ttcdemo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ttcdemo.entities.Clients;
import com.ttcdemo.entities.Sells;

public interface SellsRepository extends JpaRepository<Sells,Long> {

	List<Sells> findByClient(Clients client);
}
