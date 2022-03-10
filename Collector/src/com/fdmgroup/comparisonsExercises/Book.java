package com.fdmgroup.comparisonsExercises;

import java.util.ArrayList;

public class Book {
	
	private String title;
	private int isbn;
	private double price;
	private int numberOfPages;
	private double rating;
	
	ArrayList<Book> books  = new ArrayList<Book>();
	
//	Constructor
	public Book(String title, int isbn, double price, int numberOfPages, double rating) {
		
		this.title = title;
		this.isbn = isbn;
		this.price = price;
		this.numberOfPages = numberOfPages;
		this.rating = rating;
	}
	
	
	
	public Book() {
	
}



	//getters
	
	public String getTitle() {
		return title;
	}
	
	public int getIsbn() {
		return isbn;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getNumberOfPages() {
		return numberOfPages;
	}
	
	public double getRating() {
		return rating;
	}
	
	//Setters
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	
	public void setRating(double rating) {
		this.rating = rating;
	} 
	
	

}
