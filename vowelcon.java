/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class vowelcon
{
	public static void main (String[] args) throws java.lang.Exception
	{
		char c;
        Scanner scanner;
        scanner = new Scanner(System.in);
 
        System.out.println("Enter an Alphabet");
        c = scanner.next().charAt(0);
 
        /* Check if input alphabet is member of set{A,E,I,O,U,a,e,i,o,u} */
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                || c == 'U') {
            System.out.println(c + " is Vowel");
        } else {
            System.out.println(c + " is Consonant");
        }
    
}
		// your code goes here
	}
