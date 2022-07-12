package by.training.simplest_apps_tasks.main;

public class Cycles13 {

	public static void main(String[] args) {
		double a;
		double b;
		double h;
		
		double y;
		
		a = -5.0;
		b = 5.0;
		h = 0.5;
		
		System.out.println("---------------------------------");
		System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
		System.out.println("---------------------------------");
		
		for(double x = a; x <= b; x = x +h) {
			y = 5 - ((Math.pow(x, 2)) / 2);
			System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
		}
		System.out.println("---------------------------------");
	}

}
