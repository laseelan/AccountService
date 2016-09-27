package com.fisc.accountservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.fisc.accountservice.model.User;

public interface AccountRepository extends  CrudRepository<User, Long>{

	public User findOne(Long id);
	
	//@Query("SELECT u FROM User u where u.userId = :userId") 
	public User findByUserId(String userId);
}
