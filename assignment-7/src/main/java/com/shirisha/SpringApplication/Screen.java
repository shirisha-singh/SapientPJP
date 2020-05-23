package com.shirisha.SpringApplication;

public class Screen {
	
	private int length = 100;
	private int breadth = 100;
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	public void display()
	{
		System.out.println( "Screen size is - \nlength: "+this.length + "\nbreadth: "
				+ this.breadth
				+"\n\nGet Ready For a Display......\n");
	}
}
