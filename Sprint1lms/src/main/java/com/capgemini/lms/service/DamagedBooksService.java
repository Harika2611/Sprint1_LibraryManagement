package com.capgemini.lms.service;

import java.util.List;

import com.capgemini.lms.entities.DamagedBooks;

public interface DamagedBooksService {
	public DamagedBooks addDamagedBooks(DamagedBooks damagedBooks);
	public DamagedBooks updateDamagedBookDetails(DamagedBooks books);
	public List<DamagedBooks> viewDamagedBooksList();
	public DamagedBooks viewDamagedBookById(int id);
}

