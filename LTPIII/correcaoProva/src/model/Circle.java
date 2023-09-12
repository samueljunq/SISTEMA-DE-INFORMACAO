package model;

public class Circle implements Shape{
	private static final double PI = 3.1415;
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public String name() {
		return "Circulo";
	}

	@Override
	public double area() {
		return (this.radius * this.radius) * PI;
	}

}
