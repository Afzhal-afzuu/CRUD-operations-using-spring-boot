package com.cg.am;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Admin {
	
    @Id
	private int id;
	private String name;
	private String password;
	private String mall;
	private String phone;

	
	public Admin() {
		super();
	}


	public Admin(int id, String name, String password, String mall, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.mall = mall;
		this.phone = phone;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getMall() {
		return mall;
	}


	public void setMall(String mall) {
		this.mall = mall;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	@Override
	public String toString() {
		return "admin [id=" + id + ", name=" + name + ", password=" + password + ", mall=" + mall + ", phone=" + phone
				+ ", getId()=" + getId() + ", getName()=" + getName() + ", getPassword()=" + getPassword()
				+ ", getMall()=" + getMall() + ", getPhone()=" + getPhone() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
