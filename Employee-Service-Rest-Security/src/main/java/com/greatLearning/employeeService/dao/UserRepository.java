package com.greatLearning.employeeService.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.greatLearning.employeeService.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	@Query("SELECT u FROM User u WHERE u.username = ?1")
	public User getUserByUsername(String username);
	
	//TO REMOVE n TODO: Didn't get above one.. by instructor Pradeep following is used--TRY FIGURING OUT THEIR MEANING N WHICH TO GO ABOUT:
	//Optional<User> findByName(String username);
}