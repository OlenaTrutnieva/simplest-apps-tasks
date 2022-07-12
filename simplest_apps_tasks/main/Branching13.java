package by.training.simplest_apps_tasks.main;

public class Branching13 {

	public static void main(String[] args) {
		double x1;
		double y1;
		double a;
		
		double x2;
		double y2;
		double b;
		
		x1 = 7;
		y1 = 115.1;
		a = Math.sqrt((x1 * x1) + (y1 * y1));
		System.out.println("a =" +a);
		
		x2 = -7;
		y2 = 13.7;
		b = Math.sqrt((x2 * x2) + (y2 * y2));
		System.out.println("b =" +b);
		
		if(a < b) {
				System.out.println("X1;Y1 is closer to 0;0");
		}else {
				System.out.println("X2;Y2 is closer to 0;0");
				}
			}
	}
