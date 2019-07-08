package com.project0.beans;



import com.project0.car.CarLot;

public class Car extends CarLot  {
	public Car() {

		super();

	}

	// constructor for car

	public Car(String make, String model, String color, int year, double milage, String transmission,int carId) {

		super();

		this.make = make;

		this.model = model;

		this.color = color;

		this.year = year;

		this.milage = milage;

		this.transmission = transmission;
		this.carId= carId;

	}

	// getters and setters for CarLot

	private String make;

	private String model;

	private String color;

	private int year;

	private double milage;

	private String transmission;
	
	private Integer carId;

	// private int vin; //might create an enum later for this

	// private String drivetype;

	// private String engine;

	// getters and setters for CarLot

	public Integer getCarId() {
		return carId;
	}

	public void setCarId(Integer carId) {
		this.carId = carId;
	}

	public String getMake() {

		return make;

	}

	public void setMake(String make) {

		this.make = make;

	}

	public String getModel() {

		return model;

	}

	public void setModel(String model) {

		this.model = model;

	}

	public String getColor() {

		return color;

	}

	public void setColor(String color) {

		this.color = color;

	}

	public int getYear() {

		return year;

	}

	public void setYear(int year) {

		this.year = year;

	}

	public double getMilage() {

		return milage;

	}

	public void setMilage(double milage) {

		this.milage = milage;

	}

	public String getTransmission() {

		return transmission;

	}

	public void setTransmission(String transmission) {

		this.transmission = transmission;

	}

	@Override

	public String toString() {

		return "Car [carID="+carId+", make=" + make + ", model=" + model + ", color=" + color + ", year=" + year + ", milage="

				+ milage + ", transmission=" + transmission + "]";

	}
	
	}


