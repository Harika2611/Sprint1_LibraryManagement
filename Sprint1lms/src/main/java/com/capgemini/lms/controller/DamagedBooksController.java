package com.capgemini.lms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.lms.entities.DamagedBooks;
import com.capgemini.lms.service.DamagedBooksService;

@RestController
@RequestMapping(value="/DamagedBooks")
public class DamagedBooksController
{
	@Autowired
	DamagedBooksService damagedBooksService;
	
	@PostMapping(value="/insertDamagedBooks")
	public ResponseEntity<String> insertDamagedBooks(@RequestBody DamagedBooks damagedBooks)
	{
		damagedBooksService.addDamagedBooks(damagedBooks);
		return new ResponseEntity<>("Inserted DamagedBooks successfully" ,HttpStatus.OK);
	}
	
	@PostMapping(value="/updateDamageBooks")
	public ResponseEntity<String> updateDamagedBooksDetails(@RequestBody DamagedBooks damagedBooks)
	{
		damagedBooksService.updateDamagedBookDetails(damagedBooks);
		return new ResponseEntity<>("Updated DamagedBook details successfully" ,HttpStatus.OK);
	}
	
	@GetMapping(value="/ViewDamagedBooks")
	public List<DamagedBooks> getAllDamagedBooks()
	{
		return damagedBooksService.viewDamagedBooksList();
	}
	
	@GetMapping(value="/ViewDamagedBooksById/{id}")
	public DamagedBooks getAllDamagedBooksById(@PathVariable int id)
	{
		return damagedBooksService.viewDamagedBookById(id);
	}
	
}

