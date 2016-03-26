package groupProgrammingProject;

import java.util.Random;

public class NumberRandomiser {

	public static void main(String[] args) {
		Random randomGenerator= new Random();
		
		int randomisedNumber = randomGenerator.nextInt(10);
		System.out.println(randomisedNumber);

	}

}
