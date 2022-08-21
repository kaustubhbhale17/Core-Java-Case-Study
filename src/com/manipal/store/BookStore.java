package com.manipal.store;

import com.manipal.model.Book;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;



public class BookStore {
	
	List<Book> listOfBooks = new ArrayList<Book>();
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	boolean flag=false;
	
	public void addBook(Book b) {
		listOfBooks.add(b);
	}
	
	public void updateBook(String bookId) throws NumberFormatException, IOException {
		for(Book b : listOfBooks) {
			if(b.getBookId()==bookId) {
				flag=true;
				int choice=0;
				System.out.println("1. Update Title ");
				System.out.println("2. Update Author ");
				System.out.println("3. Update Category ");
				System.out.println("4. Update Price ");
				System.out.println("Input your choice : ");
				choice = Integer.valueOf(reader.readLine());
				
				switch(choice) {
				case 1:{
					System.out.println("Input the new title : ");
					String title = reader.readLine();
					b.setTitle(title);
					System.out.println("Title Updated successfully ! ");
					break;
					}
				case 2:{
					System.out.println("Input the Author name : ");
					String author = reader.readLine();
					b.setAuthor(author);
					System.out.println("Author Updated successfully ! ");
					break;
					}
				case 3:{
					System.out.println("Input the new category: ");
					String category = reader.readLine();
					b.setTitle(category);
					System.out.println("Category Updated successfully ! ");
					break;
					}
				case 4:{
					System.out.println("Input the new Price: ");
					float price = Float.valueOf(reader.readLine());
					b.setPrice(price);
					System.out.println("Price Updated Successfully ! ");
					break;
					}
				default:{
					System.out.println("Invalid choice ! Input proper choice");
					}
				}
				
			}
			else {
				continue;
			}
		}
		if(flag==false)
			System.out.println("Invalid Book Id ");
	}
	
	public void deleteBook(String bookId) {
		for(Book b : listOfBooks) {
			if(b.getBookId().toString()==bookId) {
				System.out.println(b.getBookId());
				flag=true;
				listOfBooks.remove(b);
				System.out.println("Book with Id : "+bookId+" deleted successfully! ");
				break;
			}
			else {
				continue;
			}
		}
		if(flag==false)
			System.out.println("Invalid Book Id");
	}
	
	public void searchByTitle(String title) {
		for(Book b : listOfBooks) {
			if(b.getTitle()==title) {
				flag=true;
				System.out.println("Book details with title "+title+"-\n");
				System.out.println("Book Id : "+b.getBookId());
				System.out.println("Book Author : "+b.getAuthor());
				System.out.println("Book Category: "+b.getCategory());
				System.out.println("Book Price : "+b.getPrice());
				System.out.println();
			}
			else {
				continue;
			}
		}
		if(flag==false)
			System.out.println("Invalid Book Title");
			
	}
	
	public void searchByAuthor(String author) {
		System.out.println("Book details with author "+author+"-\n");
		for(Book b : listOfBooks) {
			if(b.getAuthor()==author) {
				
				flag=true;
				System.out.println("Book Id : "+b.getBookId());
				System.out.println("Book Title : "+b.getTitle());
				System.out.println("Book category : "+b.getCategory());
				System.out.println("Book Price : "+b.getPrice());
				System.out.println();
			}
			else {
				continue;
			}
		}
		if(flag==false)
			System.out.println("Invalid Author");
	}
	
	public void displayAll() {
		if(listOfBooks.isEmpty())
			System.out.println("No books to display!");
		else {
			System.out.println("Details of all Books - \n");
			for(Book b : listOfBooks) {
				System.out.println("Book Id : "+b.getBookId());
				System.out.println("Book Title : "+b.getTitle());
				System.out.println("Book Author : "+b.getAuthor());
				System.out.println("Book Category : "+b.getCategory());
				System.out.println("Book Price : "+b.getPrice());
				System.out.println("------------------------------------");
				System.out.println();
			}
		}
		
	}
}
