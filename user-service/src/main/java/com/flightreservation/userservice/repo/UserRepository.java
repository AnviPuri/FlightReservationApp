package com.flightreservation.userservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightreservation.userservice.enity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
