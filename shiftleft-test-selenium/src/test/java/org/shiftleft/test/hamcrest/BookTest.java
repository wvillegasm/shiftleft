package org.shiftleft.test.hamcrest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.shiftleft.test.hamcrest.BookMatcher.hasId;
import static org.shiftleft.test.hamcrest.BookMatcher.hasIsbn;
import static org.shiftleft.test.hamcrest.BookMatcher.hasSize;

import org.junit.Before;
import org.junit.Test;

public class BookTest {

	private Book book;

	@Before
	public void setUp() {

		book = new Book(null, "55558", "A book");
	}

	@Test
	public void verify_that_isbn_exist() {

		// given
		String expectedIsbn = "5555";

		//having
		assertThat(book, hasIsbn(expectedIsbn));
	}
	
	@Test
	public void verify_that_book_id_has_value(){
		// given
		Long expectedId = 1L;
		
		// having
		assertThat(book, hasId(expectedId));
		
	}
	
	
	@Test
	public void verify_isb_length_test(){
		//given 
		Integer isbnLengh = 8;
		
		//having 
		assertThat(book, hasSize(isbnLengh));
	}

}
