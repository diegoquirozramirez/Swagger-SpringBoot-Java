package com.proyecto.api;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

@Entity
@Table(name="usuario")
public class user {

	@ApiModelProperty(notes = "Identificator user")
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ApiModelProperty(notes = "Email of user")
	@Column
	private String email;

	@ApiModelProperty(notes = "Password of user")
	@Column
	private String pass;

	@ApiModelProperty(notes = "Date create user")
	@Column
	private String created_at;

	@ApiModelProperty(notes = "Date update user")
	@Column
	private String updated_at;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

	
	
	
	
}
