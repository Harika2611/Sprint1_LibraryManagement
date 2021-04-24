package com.capgemini.lms.service;

import java.util.List;

import com.capgemini.lms.entities.Books;
import com.capgemini.lms.entities.SuggestedBooks;

public interface SuggestedBooksService {
	public SuggestedBooks suggestBooks(SuggestedBooks book); 
	public SuggestedBooks updateSuggestedBookStatus(SuggestedBooks book);
	public void deleteSuggestedBooks(int id);
	public SuggestedBooks viewSuggestedBookDetails(int id);
	public List<SuggestedBooks> viewSuggestedBooksList();
}