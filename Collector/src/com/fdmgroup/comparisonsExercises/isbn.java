package com.fdmgroup.comparisonsExercises;

import java.util.Comparator;

public class isbn implements Comparator<Book> {
	
	public int compare(Book book1, Book book2) {
		
		if(book1.getIsbn() > book2.getIsbn()) {
			return 1;
		}
		else if (book1.getIsbn() < book2.getIsbn()) {
			return -1;
		}
		
			
		return 0;
		
	}
}
