package by.training.simplest_apps_tasks.main;

public class Cycles05 {

	public static void main(String[] args) {
		int x, y;
		int sum;
		
		x = 1;
		y = 99;
		sum = 0;
		
		while(x <= y) {
			sum = sum + x;
			x++;
		}
		System.out.println("sum =" +sum);
	}

}
