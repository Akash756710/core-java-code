package abstrac;

public class Circle extends Shape{
	double radius;
	final double pi=3.14;
	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getPi() {
		return pi;
	}
	void area() {
		System.out.println("area of circle  "+ (2*pi*radius));
	}
	void perimeter() {
		System.out.println("perimeter of cicle  "+(pi*radius*radius));
	}
	
}
