package com.manipal.model;

import java.util.ArrayList;
import java.util.List;

import com.manipal.exception.InvalidBookException;

public class Book {
	
	private String bookId;
	private String title;
	private String author;
	private String category;
	private float price;
	
	
	public Book(String bookId, String title, String author, String category, float price) throws InvalidBookException{
		
		if(!(bookId.startsWith("B")||bookId.startsWith("b")) && (bookId.length()!=4))
			throw new InvalidBookException("Invalid Book Id ");
		else if(price<=0)
			throw new InvalidBookException("Price Cannot be Negative");
		else if(!containsCategory(category))
			throw new InvalidBookException("Invalid Book Category");
		else {
			this.bookId = bookId;
			this.title = title;
			this.author = author;
			this.category = category;
			this.price = price;
		}
		
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	public List<String> initializeList(){
		List<String> bookCategory = new ArrayList<String>();
		bookCategory.add("Science");
		bookCategory.add("Fiction");
		bookCategory.add("Technology");
		bookCategory.add("Others");
		
		return bookCategory;
	}
	
	public boolean containsCategory(String category) {
		List<String> booksCategory = initializeList();
		return booksCategory.contains(category);
	}
	
	
}
