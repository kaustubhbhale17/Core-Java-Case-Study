package com.manipal.model;

//POJO
public class Book {

	private String bookId;
	private String title;
	private String author;
	private String category;
	private float price;
	
	
	public Book(String bookId, String title, String author, String category, float price) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
		
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
	
	@Override
	public String toString() {
		return "\tBookId : " + bookId + " \n\tTtitle:" + title + " \n\tAuthor:" + author + " \n\tCategory:" + category
				+ " \n\tPrice=" + price + "";
	}
	
}
