package com.tomatopals.pomoduckjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tomatopals.pomoduckjava.entity.*;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}