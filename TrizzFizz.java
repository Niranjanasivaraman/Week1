package week1.day1;

public class TrizzFizz {

	public static void main(String[] args) {

		int number = 0; 
		if (number%3==0) {
			System.out.println("Not divided by 3 and 5"); // priority is the first if you give here ("print as Trizz")it shows you output first
		} else if (number%5==0){
			System.out.println("print as Fizz");
		} else  {
			System.out.println("print as Trizz "); 
		}

	}

}

