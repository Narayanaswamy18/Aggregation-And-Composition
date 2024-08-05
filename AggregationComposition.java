package com.corjava;
import java.util.*;
class Heart{
	private int weight;
	private int bpm;
	
	//Set the values
	public Heart(int weight,int bpm) {
		this.weight=weight;
		this.bpm=bpm;
	}
	
	
	//Get the values 
	public int getWeight() {
		return weight;	
	}
	public int getBpm() {
		return bpm;
	}	
}
class Brain{
	private int weight;
	private String colour;
	
	//Set the values
	public Brain(int weight,String colour) {
		this.weight=weight;
		this.colour=colour;
	}
	
	//Get the values
	public int getWeight() {
		return weight;
	}
	public String getColour() {
		return colour;
	}
}
class Bike{
	private String brand;
	private float mileage;
	
	//Set the values
	public Bike(String brand,float mileage) {
		this.brand = brand;
		this.mileage = mileage;
	}
	
	
	//Get the values
	public String getBrand() {
		return brand;
	}
	public float getMileage() {
		return mileage;
	}
}
class Book{
	private String name;
	private String author;
	
	//Set the values 
	public Book(String name,String author) {
		this.name = name;
		this.author = author;
	}
	
	//Get the values 
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
}
class Student{
	Heart h=new Heart(50,25);
	Brain b=new Brain(65,"red");
	
	void hasA(Bike bike) {
		System.out.println(bike.getBrand());
		System.out.println(bike.getMileage());
	}
	void hasA(Book book) {
		System.out.println(book.getName());
		System.out.println(book.getAuthor());
	}	
}

public class AggregationComposition {

	public static void main(String[] args) {
		Student s=new Student();
		Bike bike=new Bike("Duke",35.8f);
		Book book=new Book("Silent","Shakesphere");
		System.out.println(s.h.getWeight());
		System.out.println(s.h.getBpm());
		System.out.println(s.b.getWeight());
		System.out.println(s.b.getColour());
		s.hasA(bike);
		s.hasA(book);
		
		s=null;
		
		/*System.out.println(s.h.getWeight());
		System.out.println(s.h.getBpm());
		System.out.println(s.b.getWeight());
		System.out.println(s.b.getColour());*/
		
		System.out.println((bike.getBrand()));
		System.out.println(bike.getMileage());
		System.out.println(book.getName());
		System.out.println(book.getAuthor());
		
	}

}
