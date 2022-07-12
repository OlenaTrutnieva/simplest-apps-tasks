package by.training.simplest_apps_tasks.main;

public class Cycles11 {

	public static void main(String[] args) {
		double a;
		double b;
		double z;
		
		a = 1;
		z = Math.pow(a,  3);
		
		while(a <= 200) {
			b = Math.pow(a,  3);
			z = z - b;
			a = a + 1;
		}
		
		System.out.println("z =" + z);
		
	}

}
