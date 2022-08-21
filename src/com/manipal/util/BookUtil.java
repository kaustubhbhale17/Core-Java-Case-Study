package com.manipal.util;

import com.manipal.model.Book;
import com.manipal.store.BookStore;
import com.manipal.exception.InvalidBookException;

import java.io.IOException;



public class BookUtil {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BookStore bs = new BookStore();
		
		try {
			Book b1 = new Book("B100","Harry 1","JK Rollings","Fiction",169f);
			Book b2 = new Book("B102","Harry 2","JK Rollings","Fiction",199.23f);
			Book b3 = new Book("B103","Maths 1","RD Sharma","Science",200f);
			Book b4 = new Book("B104","Science 1","Geo National","Fiction",299f);
			
			bs.addBook(b1);bs.addBook(b2);bs.addBook(b3);bs.addBook(b4);
			bs.displayAll();
			
			bs.deleteBook("B100");
			
			bs.displayAll();
			
			bs.updateBook("B102");
			bs.displayAll();
			bs.searchByAuthor("JK Rollings");
			bs.searchByTitle("Science 1");
			
			
		} catch (InvalidBookException e) {
			
			e.printStackTrace();
		}
		/*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		BookStore bookStore = new BookStore();
		int option=0;
		do {
			System.out.println("1. Add Book");
			System.out.println("2. Delete Book");
			System.out.println("3. Update Book");
			System.out.println("4. Search By Author");
			System.out.println("5. Search By Title");
			System.out.println("6. Display All Books ");
			System.out.println("7. Exit");
			
			
			System.out.println("Input your choice : ");
			option = Integer.valueOf(reader.readLine());
			
			switch(option) {
				case 1:{
					System.out.println("Enter Book Id : ");
					String bookId = reader.readLine();
					System.out.println("Enter Book Title : ");
					String title = reader.readLine();
					System.out.println("Enter Book Author : ");
					String author = reader.readLine();
					System.out.println("Enter Book Category : ");
					String category = reader.readLine();
					System.out.println("Enter Book Price : ");
					float price = Float.valueOf(reader.readLine());
					
					try {
						//add book
						Book b = new Book(bookId,title,author,category,price);
						bookStore.addBook(b);
						System.out.println("\nBook Added Successfully !");
						System.out.println();
					}
					catch(InvalidBookException e) {
						System.out.println(e.getMessage().toString());
					}
					break;
				}
				
				case 2:{
					//delete book
					System.out.println("Enter the book id to be deleted ");
					String bookId = reader.readLine();
					bookStore.deleteBook(bookId);
					break;
				}
				case 3:{
					//update book
					System.out.println("Enter the book id for which the fields are to updated : ");
					String bookId = reader.readLine();
					bookStore.updateBook(bookId);
					break;
				}
				case 4:{
					//search by author
					System.out.println("Enter the name of author whose books are to be searched : ");
					String author = reader.readLine();
					bookStore.searchByAuthor(author);
					break;
				}
				case 5:{
					//search by title
					System.out.println("Enter the title of book : ");
					String title = reader.readLine();
					bookStore.searchByTitle(title);
					break;
				}
				case 6:{
					//display all books
					bookStore.displayAll();
					break;
				}
				case 7:{
					System.out.println("Thanks for using my Application ! ");
					System.exit(0);
				}
				default:{
					System.out.println("Invalid Choice! Input proper choice ");
					System.out.println();
				}
			}
		}while(option!=7);*/
		
		
	}

}
