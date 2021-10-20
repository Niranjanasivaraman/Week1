package week1.day1;

public class PositiveOrNegativeOrNeutral {

	public static void main(String[] args) {

		int number = 20; // if number = -20 (it must be negative)
		if (number > 0) {
			System.out.println("The number is Positive");
		} else if (number < 0) {
			System.out.println("The number is Negative");
		} else {
			System.out.println("The number is Neutral"); // if number = 0 (it must be Neutral)
		}
	}

}
