package com.item.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.item.app.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
