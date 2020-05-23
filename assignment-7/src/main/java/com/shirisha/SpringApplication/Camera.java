package com.shirisha.SpringApplication;

public class Camera {

	private double numberOfMegaPixels = 20.4;
	private String color = "black";
	private String brand = "panasonic";
	
	
	public double getNumberOfMegaPixels() {
		return numberOfMegaPixels;
	}

	public void setNumberOfMegaPixels(double numberOfMegaPixels) {
		this.numberOfMegaPixels = numberOfMegaPixels;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String company) {
		this.brand = company;
	}
	
	public void click()
	{
		System.out.println("Camera specs: \n"
				+ "numberOfMegaPixels: " + this.numberOfMegaPixels
				+ "\ncolor: " + this.color + "\nbrand: " + this.brand);
		System.out.println("\nStart clicking...");
	}
	
	public void record()
	{
		System.out.println("Start recording...");
	}
}
