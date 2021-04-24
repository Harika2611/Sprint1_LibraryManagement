package com.capgemini.lms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.lms.entities.SuggestedBooks;
import com.capgemini.lms.service.SuggestedBooksService;

@RestController
@RequestMapping(value="/SuggestedBooks")
public class SuggestedBooksController 
{
	@Autowired
	SuggestedBooksService suggestedBooksService;
	
	
	@PostMapping(value="/updateSuggestedBooks")
	public ResponseEntity<String> updateSuggestedBooks (@RequestBody SuggestedBooks suggestedBooks)
	{
		suggestedBooksService.updateSuggestedBookStatus(suggestedBooks);
		return new ResponseEntity<>("Updated SuggestedBook status sucessfully" ,HttpStatus.OK);
	}
	
	@DeleteMapping(value="/deleteAll")
	public ResponseEntity<String> deleteSuggestedBooks(int id) 
	{
		suggestedBooksService.deleteSuggestedBooks(id);
		return new ResponseEntity<String>("Deleted",HttpStatus.OK);
	}
	
	@GetMapping(value="/ViewSuggestedBooks")
	public List<SuggestedBooks> getAllSuggestedBooks(){
		return suggestedBooksService.viewSuggestedBooksList();
	}
	
	@GetMapping(value="/ViewSuggestedBooksById/{id}")
	public SuggestedBooks getAllSuggestedBooksById(@PathVariable int id)
	{
		return suggestedBooksService.viewSuggestedBookDetails(id);
	}
	
}

