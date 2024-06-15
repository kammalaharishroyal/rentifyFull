package com.harish.rentify.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harish.rentify.entity.Property;

public interface PropertyRepo extends JpaRepository<Property, Integer> {

}
