package com.harish.rentify.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harish.rentify.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
