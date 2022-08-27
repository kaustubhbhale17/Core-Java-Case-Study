package com.manipal.store;

import com.manipal.model.Book;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;



public class BookStore{
	
	List<Book> listOfBooks = new ArrayList<Book>();
	Scanner readString = new Scanner(System.in);
	Scanner readNumber = new Scanner(System.in);
	
	public void addBook(Book book) {
		listOfBooks.add(book);
		
	}
	
	public void updateBook(String bookId)  {
		boolean flag=false;
		String id = bookId;
		for(Book book : listOfBooks) {
			if(id.contentEquals(bookId)) {
				flag=true;
				System.out.print("Enter the new title : ");
				String title = readString.nextLine();
				book.setTitle(title);
				System.out.println("Updated title is : "+book.getTitle());
				
			}else {
				continue;
			}
		}
		if(!flag) {
			System.out.println("No book found ! ");
		}else {
			System.out.println("Data updated successfully");
		}
		
		
	}


	public void searchByAuthor(String author) {
		
		boolean flag = false;
		
		for(Book book : listOfBooks) {
			if(author.contentEquals(book.getAuthor())) {
				flag=true;
				System.out.print("BookId is "+book.getBookId());
				continue;
			}
		}
		
		if(!flag) {
			System.out.println("No book found for given author! ");
		}
		
	}

	public void searchByTitle(String title) {
		
		boolean flag=false;
		for(Book b : listOfBooks) {
			if(title.contentEquals(b.getTitle())) {
				flag=true;
				System.out.println("Book ID : "+b.getBookId());
				System.out.println("Author : "+b.getAuthor());
				System.out.println("Price : "+b.getPrice());
				
			}
		}
		if(flag==false) {
			System.out.println("No book found with given title!");
		}
	}
	
	public void displayAll() {
		if(listOfBooks.isEmpty()) {
			System.out.println("Nothing to display ! ");
			return;
		}
		System.out.println("\nDetails of all Books - \n");
		for(Book book : listOfBooks) {
			System.out.println(book);
			System.out.println("---------------------------------------");
		}
		
	}
	
	
}
