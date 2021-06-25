package logicalprograms;

import java.util.Scanner;

public class SquareRoot
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
	    System.out.println("Enter a num : ");
		int c = s.nextInt(); 
		final double epsilon = 1e-15;    
        float t = c;              
        while (Math.abs(t - c/t) > epsilon*t) 
        {
        	double last = t;
            t = (float) ((c/t + t) / 2.0);
            if (last ==t)
            {
             break;
            }
         }
        System.out.println("Square root of " + c + " : " + t);
	}

}
