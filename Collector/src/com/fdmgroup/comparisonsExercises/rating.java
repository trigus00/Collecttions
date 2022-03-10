package com.fdmgroup.comparisonsExercises;

import java.util.Comparator;

public class rating implements Comparator<Book> {
	
	public int compare(Book book1, Book book2) {
		
		if(book1.getRating() > book2.getRating()) {
			return 1;
		}
		else if (book1.getRating() < book2.getRating()) {
			return -1;
		}
		
			
		return 0;
		
	}
	
}