package com.proyecto.api;


import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

//@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/user"})
@Api(value = "User API REST", description = "Shows Methods for consumer")
public class controller {
	@Autowired
	private userServices userServ;
	
	@Autowired
	ObjectMapper mapper;

	@ApiOperation(value = "Get All Users")
	@GetMapping({"/listar"})
	public List<user>listar(){
		return userServ.listar();
	}

	@ApiOperation(value = "Save One User")
	@PostMapping({"/agregar"})
	public user agregar(@RequestBody user u) {
		return userServ.add(u);
	}

	@ApiOperation(value = "Get One User")
	@ApiResponses(
			value = {
					@ApiResponse(code = 200, message = "Sucess Process")
			}
	)
	@GetMapping(path = "/listar/{id}")
	public user listarId(@PathVariable("id")int id) {
		return userServ.listarId(id);
	}

	@ApiOperation(value = "Update One User")
	@PutMapping(path = "/actualizar/{id}")
	public user actualizar(@RequestBody user u, @PathVariable("id")int id) {
		u.setId(id);
		return userServ.editar(u);
	}

	@ApiOperation(value = "Delete One User")
	@DeleteMapping(path = "eliminar/{id}")
	public user eliminar(@PathVariable("id")int id) {
		return userServ.delete(id);
	}

}
