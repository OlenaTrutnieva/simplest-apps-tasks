package by.training.simplest_apps_tasks.main;

public class Cycles09 {

	public static void main(String[] args) {
		double a;
		double c;
		double sum;
		
		a = 1;
		
		sum = 0;
		
		while(a <=100) {
			c = Math.pow(a, 2);
			sum = sum + c;
			a++;
		}
        System.out.println("Sum =" + sum);
	}

}
