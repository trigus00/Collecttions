package com.fdmgroup.comparisonsExercises;


import java.util.Comparator;

public class numberOfPages implements Comparator<Book> {


	public int compare(Book book1, Book book2) {
		// TODO Auto-generated method stub
	
		
		
		if(book1.getNumberOfPages() > book2.getNumberOfPages()) {
			return -1;
		}
		else if (book1.getNumberOfPages() < book2.getNumberOfPages()) {
			return 1;
		}
		
		
		return 0 ;
	}

	
	
}
