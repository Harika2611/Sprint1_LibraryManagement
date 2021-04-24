package com.capgemini.lms.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.lms.dao.DamagedBooksDao;
import com.capgemini.lms.entities.DamagedBooks;
import com.capgemini.lms.service.DamagedBooksService;

@Service
public class DamagedBooksServiceImpl implements DamagedBooksService
{
	@Autowired
	DamagedBooksDao damagedBooksDao;

	@Override
	public DamagedBooks addDamagedBooks(DamagedBooks damagedBooks) {
		
		return damagedBooksDao.save(damagedBooks);
	}

	@Override
	public DamagedBooks updateDamagedBookDetails(DamagedBooks books) {
		
	  return damagedBooksDao.save(books);
	  
	}

	@Override
	public List<DamagedBooks> viewDamagedBooksList() {
		
		return damagedBooksDao.findAll();
	}

	@Override
	public DamagedBooks viewDamagedBookById(int id) {
		
		return damagedBooksDao.findById(id).get();
	}
	
	
}

