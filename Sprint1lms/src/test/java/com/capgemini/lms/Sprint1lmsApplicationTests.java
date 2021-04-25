package com.capgemini.lms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capgemini.lms.entities.Books;
import com.capgemini.lms.entities.DamagedBooks;
import com.capgemini.lms.service.DamagedBooksService;

@SpringBootTest
class Sprint1lmsApplicationTests {

	@Autowired
	DamagedBooksService damagedBooksService;

    @Test
	void addDamagedBooksTest() 
    {
    	Books book1= new Books("Java programmming language","Core Java","James Gosling","Sun",1975,"ISBN178",7,789.86,"b14");
    	DamagedBooks damagedBooks1 = new DamagedBooks(1,book1,4,"Binding damage");
    	assertEquals("Principles of C",damagedBooksService.addDamagedBooks(damagedBooks1).getBook().getTitle());
	}

}
