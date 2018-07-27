/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class power
{

    public static void main(String[] args) {

        int base = 3, exponent = 4;

        long result = 1;

        while (exponent != 0)
        {
            result *= base;
            --exponent;
        }

        System.out.println("Answer = " + result);
    }
}

		
		// your code goes here
	
