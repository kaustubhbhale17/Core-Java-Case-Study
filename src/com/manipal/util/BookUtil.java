package com.manipal.util;

import com.manipal.model.Book;
import com.manipal.store.BookStore;
import com.manipal.exception.InvalidBookException;

import java.util.Scanner;
import java.io.IOException;



public class BookUtil {
	
	public static void main(String[] args) throws IOException,InvalidBookException {
		Scanner readString = new Scanner(System.in);
		Scanner readNumber = new Scanner(System.in);
		int choice=0;
		BookStore bs = new BookStore();
		
		do {
			System.out.println("---------------------------------------");
			System.out.println("1. Add Book");
			System.out.println("2. Update Book");
			System.out.println("3. Search book by Author");
			System.out.println("4. Search book by Title");
			System.out.println("5. Display all books");
			System.out.println("6. Exit");
			System.out.println("---------------------------------------");
			System.out.print("Enter your choice : ");
			choice=readNumber.nextInt();
			
			switch(choice) {
			case 1:{
				System.out.println("Enter book id : ");
				String bookId = readString.nextLine();
				
				try {
					ValidateBookDetails.validateBookId(bookId);
				}catch(InvalidBookException e) {
					System.out.println(e.getMessage());
					System.out.println("Failed to add book! ");
					break;
				}
				
				System.out.println("Enter title : ");
				String title = readString.nextLine();
				
				System.out.println("Enter author : ");
				String author = readString.nextLine();
				
				System.out.println("Enter category : ");
				String category = readString.nextLine();
				try {
					ValidateBookDetails.validateCategory(category);
				}catch(InvalidBookException e) {
					System.out.println(e.getMessage());
					System.out.println("Failed to add book! ");
					break;
				}
				
				System.out.println("Enter price : ");
				float price = readNumber.nextFloat();
				try {
					ValidateBookDetails.validatePrice(price);
				}catch(InvalidBookException e) {
					System.out.println(e.getMessage());
					System.out.println("Failed to add book! ");
					break;
				}
				
				//create a new book 
				Book b = new Book(bookId,title,author,category,price);
				bs.addBook(b);
				System.out.println("Book added succesfully");
				break;
				}
			case 2:{
				System.out.println("Enter the bookId : ");
				String bookId = readString.nextLine();
				bs.updateBook(bookId);
				break;
			}
			case 3:{
				System.out.println("Enter the name of author : ");
				String author = readString.nextLine();
				bs.searchByAuthor(author);
				break;
			}
			case 4:{
				System.out.println("Enter the title : ");
				String title = readString.nextLine();
				bs.searchByTitle(title);
				break;
			}
			case 5:{
				bs.displayAll();
				break;
			}
			case 6:{
				System.out.println("Thanks for using my application ! Have a great day ahead!!! ");
				System.exit(0);
			}
			}
		}while(choice!=6);
		
		readString.close();
		readNumber.close();
	}

}
