package by.training.simplest_apps_tasks.main;

public class Cycles07 {

	public static void main(String[] args) {
		double a;
		double b;
		double h;
		double y;
		
		a = -2;
		b = 3;
		h = 0.5;
		
		System.out.println("---------------------------------");
		System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
		System.out.println("---------------------------------");
		
		for(double x = a; x <= b; x = x + h) {
			if(x > 2) {
				y = x;
				System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
		}else if (x <=2) {
				y = -x;
				System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
			}
		}	

	}

}
