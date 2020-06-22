package com.proyecto.api;

import java.util.List;

public interface userServices {
	
	List<user>listar();
	user listarId(int id);
	user add(user u);
	user editar(user u);
	user delete(int id);
}
