package Practice;

import java.util.Random;

public class twoRandom {
	
	public static int twoRandom () {
		
		Random ran = new Random();
		String p = Integer.toString(ran.nextInt(10));
		String q = Integer.toString(ran.nextInt(10));				
		
		return Integer.parseInt(p+q);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( twoRandom.twoRandom());
	}

}
