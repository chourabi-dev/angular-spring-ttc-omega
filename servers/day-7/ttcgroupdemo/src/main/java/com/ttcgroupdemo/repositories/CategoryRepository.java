package com.ttcgroupdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ttcgroupdemo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}
