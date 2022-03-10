package com.fdmgroup.comparisonsExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class runner {

	
	
		
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Comparators
//		ArrayList<Book> books  = new ArrayList<Book>();
		numberOfPages numOfPage = new numberOfPages();
		name names = new name();
		price prices = new price();
		isbn id = new isbn();
		rating ratings = new rating();
		priceA price = new priceA();
		
		TreeSet<Book> priceTS  = new TreeSet<Book>(ratings);
//		TreeSet<Book> ratingsTS  = new TreeSet<Book>(ratings);
		
		
		
		//Initionlizing my book object
		Book book1 = new Book("Learn Java", 45678,19.99,500,4.3);
		Book book2 = new Book("Learn Unix", 65432,17.50,650,3.9);
		Book book3 = new Book("Learn SQL", 87956,9.75,220,4.4);
		Book book4 = new Book("Learn Agile", 35367,25.50,500,4.4);
		Book book5 = new Book("Learn React", 55676,28.75,490,4.8);
		Book book6 = new Book("Learn JavaScript", 34343,14.99,300,4.4);
		Book book7 = new Book("Learn Python", 65767,27.25,500,4.1);
		
//		Collections 
//		books.add(book1);
//		books.add(book2);
//		books.add(book3);
//		books.add(book4);
//		books.add(book5);
//		books.add(book6);
//		books.add(book7);

		
//		TreeSet 
		priceTS.add(book1);
		priceTS.add(book2);
		priceTS.add(book3);
		priceTS.add(book4);
		priceTS.add(book5);
		priceTS.add(book6);
		priceTS.add(book7);
		
		
		
		
		
//		Collections.sort(books, price);
//		Collections.sort(books, ratings.thenComparing(price));
		
//		Collections Set
//		for(Book showBook : books) {
//			
//			System.out.println("Title: " + showBook.getTitle() + " | isbn: " + showBook.getIsbn() + "| Price: " + showBook.getPrice() + "| Number of Page: " + showBook.getNumberOfPages() + "| Rating" + showBook.getRating());
//		}
		
		
// --------------------------------------------------------------------------------------------------
		
		
//		Tree set
		
		
		Comparator.compare(priceTS, ratings.thenComparing(price));
		for(Book showBook : priceTS) {
			
			System.out.println("Title: " + showBook.getTitle() + " | isbn: " + showBook.getIsbn() + "| Price: " + showBook.getPrice() + "| Number of Page: " + showBook.getNumberOfPages() + "| Rating" + showBook.getRating());
		}

//System.out.print("---------------------------------------------------------------");
//for(Book showBook : ratingsTS) {
//	
//	System.out.println("Title: " + showBook.getTitle() + " | isbn: " + showBook.getIsbn() + "| Price: " + showBook.getPrice() + "| Number of Page: " + showBook.getNumberOfPages() + "| Rating" + showBook.getRating());
//}
		

	}

}
