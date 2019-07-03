package com.project0.car;

public class CarLot {

	public CarLot() {

		super();

	}

	// constructor for carLot

	public CarLot(String make, String model, String color, int year, double milage, String transmission) {

		super();

		this.make = make;

		this.model = model;

		this.color = color;

		this.year = year;

		this.milage = milage;

		this.transmission = transmission;

	}

	// getters and setters for CarLot

	private String make;

	private String model;

	private String color;

	private int year;

	private double milage;

	private String transmission;

	// private int vin; //might create an enum later for this

	// private String drivetype;

	// private String engine;

	// getters and setters for CarLot

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

		return "CarLot [make=" + make + ", model=" + model + ", color=" + color + ", year=" + year + ", milage="

				+ milage + ", transmission=" + transmission + "]";

	}

}
