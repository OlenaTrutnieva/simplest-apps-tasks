package by.training.simplest_apps_tasks.main;

public class Linear13 {

	public static void main(String[] args) {
		double x1;
		double y1;
		double a;
		
		double x2;
		double y2;
		double b;
		
		double x3;
		double y3;
		double c;
		
		double p;
		double s;
		
		x1 = 5;
		y1 = 9;
		
		x2 = 2;
		y2 = 3;
		
		x3 = 8;
		y3 = 1;
		
		a = Math.sqrt((Math.pow((x1 - x2), 2) + (Math.pow((y1 - y2), 2))));
		System.out.println("a =" +a + "sm");
		
		b = Math.sqrt((Math.pow((x2 - x3), 2) + (Math.pow((y2 - y3), 2))));
		System.out.println("b =" +b + "sm");
		
		c = Math.sqrt((Math.pow((x3 - x1), 2) + (Math.pow((y3 - y1), 2))));
		System.out.println("c =" +c + "sm");
		
		p = a + b + c;
		System.out.println("p =" +p + "sm");
		
		s = 0.5 * ((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1));
		System.out.println("s =" +s + "sm2");
	
		
	}

}
