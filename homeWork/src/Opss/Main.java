package Opss;

import Opss.Circle;
import Opss.Rectengle;

public class Main {

	public static void main(String[] args) {
		Rectengle r=new Rectengle("red", 10, 9);
		r.area();
		r.perimeter();
        Circle c=new Circle("red", 7);
        	c.area();
        c.perimeter();
        Squar s=new Squar(10);
        s.perimeter();
        s.area();
        

	}

}
