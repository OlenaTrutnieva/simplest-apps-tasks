package by.training.simplest_apps_tasks.main;

public class Branching08 {

	public static void main(String[] args) {
		double a;
		double b;
		
		a = 78.0;
		b = -78.0;
		
		if((a * a) < (b * b)) {
			System.out.println("Sruare a is less then square b.");
		}else if((b * b) < (a * a)) {
			System.out.println("Sruare b is less then square a.");
		}else {
			System.out.println("Sruare b is equal to square a.");
		}
	}

}
