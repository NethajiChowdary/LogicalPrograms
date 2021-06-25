package logicalprograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int	reversed = 0;

	    while(num > 0) {
	    
	      int digit = num % 10;
	      reversed = reversed * 10 + digit;

	      	      num /= 10;
	    }

	    System.out.println("Reversed Number: " + reversed);
	}

}
