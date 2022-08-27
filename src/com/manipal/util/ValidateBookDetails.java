package com.manipal.util;

import java.util.ArrayList;
import java.util.List;

import com.manipal.exception.InvalidBookException;

public class ValidateBookDetails {
	
	public static void validateBookId(String bookId) throws InvalidBookException{
		if(bookId.length()!=4)
			throw new InvalidBookException("Book Id must be of exactly 4 characters");
		if(!bookId.startsWith("B"))
				throw new InvalidBookException("Book Id must start with B");	
		
	}
	
	public static void validatePrice(float price) throws InvalidBookException{
		if(price<=0)
			throw new InvalidBookException("Price cannot be negative");
	}
	
	public static void validateCategory(String category) throws InvalidBookException{
		
		List<String> listOfCategories = new ArrayList<>(List.of("Science","Fiction","Others"));
		if(!listOfCategories.contains(category))
			throw new InvalidBookException("Book category is invalid");
	}


}
