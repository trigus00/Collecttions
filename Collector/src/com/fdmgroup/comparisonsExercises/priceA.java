package com.fdmgroup.comparisonsExercises;

import java.util.Comparator;

public class priceA implements Comparator<Book> {
	
	public int compare(Book book1, Book book2) {
		
		if(book1.getPrice() > book2.getPrice()) {
			return -1;
		}
		else if (book1.getPrice() < book2.getPrice()) {
			return 1;
		}
		
			
		return 0;
		
	}



}
