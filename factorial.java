/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Factorial
{

   public static void main(String[] args) {
       int n = 7;
       int result = 1;
       for (int i = 1; i <= n; i++) {
           result = result * i;
       }
       System.out.println("The factorial of 7 is " + result);
   }
}
		// your code goes here
	
