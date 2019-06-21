import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

        
        
        String delims = "[ .,?!'_@]+";//Create a string of delimiters
        String[] tokens = s.trim().split(delims);//remove these delimeters and extra blanks from the string

        System.out.println(tokens.length);//Print the amount of words in the string
        for(int i = 0; i < tokens.length; i++){//for the amount of words
            System.out.println(tokens[i]);//print out.
            }


        scan.close();
    }
}