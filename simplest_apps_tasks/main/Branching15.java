package by.training.simplest_apps_tasks.main;

public class Branching15 {

	public static void main(String[] args) {
		double x;
		double y;
		
		x = 55.9;
		y = 19.78;
		
		if(x < y) {
			x = (x + y) / 2;
			y = x * y * 2;
			System.out.println(" x = " + x + "   " + "y = " + y);
		}else {
			y = (x + y) / 2;
			x = x * y * 2;
			System.out.println(" x = " + x + "   " + "y = " + y);
		}

	}

}
