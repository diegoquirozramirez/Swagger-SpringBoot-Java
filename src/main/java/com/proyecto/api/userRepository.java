package com.proyecto.api;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface userRepository extends Repository<user, Integer>{
	List<user>findAll();
	user findById(int id);
	user save(user u);
	void delete(user u);
}
