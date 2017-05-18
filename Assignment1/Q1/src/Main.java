import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
*****
* Given two strings, write a method to decide if one is a permutation of the other.
* For example:
*
* Listen, Silent ⇒ True
* Triangle, Integral ⇒ True
* Apple, Pabble ⇒ False
*
*
* Solution created by Alice Colt
*****
*/

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two strings: ");

        //Get input strings
        String string1 = scanner.next();
        String string2 = scanner.next();

        // Cannot meet the condition if their sizes are different.
        if(string1.length() != string2.length())
        {
            System.out.println("The two strings do not have the same length -- Not permutations!");
        }//if
        else
        {    
            if(checkPermutation(string1.toLowerCase(), string2.toLowerCase()))
            {
                System.out.println("\" " + string1 + " \" is a permutation of \" " + string2 + " \"!");
            }//if
            else
            {
                System.out.println("\" " + string1 + " \" is NOT a permutation of \" " + string2 + " \"!");
            }//else  
        }//else

    }//Main

    // Check if the number of characters of each type are the same for both strings
    public static boolean checkPermutation(String s1, String s2)
    {
        char[] charS1 = s1.toCharArray();
        char[] charS2 = s2.toCharArray();

        Arrays.sort(charS1);
        Arrays.sort(charS2);

        return Arrays.equals(charS1, charS2);
    }//checkPermutation
}//Main