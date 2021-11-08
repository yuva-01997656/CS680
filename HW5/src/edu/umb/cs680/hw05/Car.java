package edu.umb.cs680.hw05;

public class Car { 
    private String make, model; 
    private int mileage, year; 
    private float price; 
    
    public Car(String make, String model, int price, int mileage, int year) {
        this.make = make;
        this.model = model; 
        this.price = price;
        this.mileage = mileage;
        this.year = year;
    }

    public String getMake(){
        return this.make;
    }

    public String getModel(){
        return this.model;
    }

    public int getMileage(){
        return this.mileage;
    }

    public int getYear(){
        return this.year;
    }

    public float getPrice(){
        return this.price;
    }

    public static void main(String[] args) {
		Car car = new Car("Mercedes", "S Class", 10, 2017, 95000);
		System.out.println("Make: " + car.getMake());
		System.out.println("Model: " + car.getModel());
		System.out.println("Mileage: " + car.getMileage());
		System.out.println("Year: " + car.getYear());
		System.out.println("Price: " + car.getPrice());

	}

} 
