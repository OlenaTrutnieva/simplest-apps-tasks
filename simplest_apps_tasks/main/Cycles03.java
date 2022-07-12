package by.training.simplest_apps_tasks.main;

public class Cycles03 {

	public static void main(String[] args) {
		int x;
		int y;
		int z;
		
		x = 3;
		y = 1;
		
		z = x * y;
		
		while(y <= 10) {
			System.out.println(+x + " * " + y + " = " + z);
			y = y + 1;			
		}
	}

}
