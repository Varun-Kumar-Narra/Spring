package com.spring;

import java.util.*;

public class Library {
	private List<Book> book; // Property

	public List<Book> getBooks() {
		return book;
	}

	public void setBooks(List<Book> book) { // Setter Injection
		this.book = book;
	}
	

}
