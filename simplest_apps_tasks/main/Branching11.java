package by.training.simplest_apps_tasks.main;

public class Branching11 {

	public static void main(String[] args) {
		double s1;
		double s2;
		double s3;
		double max;
		
		s1 = 19.99;
		s2 = 28.0;
		s3= 28.0;
		
		if((s1 > s2) & (s1 > s3)) {
			max = s1;
			System.out.println("max =" + "s1 =" + max);
		}else if((s2 > s1) & (s2 > s3)) {
			max = s2;
			System.out.println("max =" + "s2 =" + max);
		}else {
			max = s3;
			System.out.println("max =" + "s3 =" + max);
		}

	}

}
