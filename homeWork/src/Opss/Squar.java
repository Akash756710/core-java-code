package Opss;

public class Squar {
    double length;

	public Squar(double length) {
		super();
		this.length = length;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
    void area() {
    	System.out.println("area of square  "+(length*length));
    }
    void perimeter() {
    	System.out.println("perimeter of squar  "+ (4*length));
    }
}
