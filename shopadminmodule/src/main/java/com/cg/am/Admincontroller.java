package com.cg.am;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Admincontroller {
	@Autowired
private Adminservice Service ; 
	
	//Retrieval
	@GetMapping("/Admins")
	public List<Admin> list()
	{
		return Service.listAll();
		
	}
//retrieve By id
	@GetMapping("/Admins/{id}")
	public ResponseEntity <Admin> get(@PathVariable Integer id)
	{
		
		try {
			Admin admin= Service.get(id);
			return new ResponseEntity <Admin>(admin,HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity <Admin>(HttpStatus.NOT_FOUND);
		}
	}
	//create
	@PostMapping("/admins")
	public void add(@RequestBody Admin admin) {
		
		
		Service.save(admin);
		
	}
	
	//update
	@PutMapping("/admins/{id}")
	public ResponseEntity<?> update(@RequestBody Admin admin,@PathVariable Integer id){
		try {
			Service.save(admin);
			return new ResponseEntity <> (HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity <> (HttpStatus.NOT_FOUND);
		}}
	
		//delete
		@DeleteMapping("/admins/{id}")
		public void delete(@PathVariable Integer id) {
			
			Service.delete(id);
			
		
		
	}
	
	
	
	
}

