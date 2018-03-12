

import java.lang.Math;
import java.util.Random;
class Aleatoire {
	public static void main(String[] args) {
		double x = Math.random();
		Random y = new Random();
		System.out.println("random propose :  "+x);
		System.out.println("nextDouble propose :  "+y.nextDouble());
		
	}
}