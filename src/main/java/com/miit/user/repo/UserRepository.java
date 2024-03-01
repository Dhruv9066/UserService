package com.miit.user.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.miit.user.entites.User;


@Repository
public interface UserRepository extends CrudRepository<User, Long>{

	//TO-DO User Repo Need to be updated
	
}
