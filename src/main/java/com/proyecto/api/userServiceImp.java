package com.proyecto.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userServiceImp implements userServices{
	
	@Autowired
	private userRepository userRepo;
	
	
	@Override
	public List<user> listar() {
		
		return userRepo.findAll();
	}

	@Override
	public user listarId(int id) {
		// TODO Auto-generated method stub
		return userRepo.findById(id);
	}

	@Override
	public user add(user u) {
		// TODO Auto-generated method stub
		return userRepo.save(u);
	}

	@Override
	public user editar(user u) {
		// TODO Auto-generated method stub
		return userRepo.save(u);
	}

	@Override
	public user delete(int id) {
		// TODO Auto-generated method stub
		user u = userRepo.findById(id);
		if(u!=null) {
			userRepo.delete(u);
		}
		return u;
	}

}
