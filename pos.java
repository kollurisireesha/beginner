/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int num;
        Scanner s = new Scanner(System.in);
        System.out.println("enter any integer  number:");
        num = s.nextInt();
        if(num > 0)
        {
            System.out.println( num + " is Positive");
        }
        else if(num < 0)
        {
            System.out.println( num  + " is Negative");
        }
        else
        {
            System.out.println(num + " its zero ");
       
		// your code goes here
	}
	}
}
