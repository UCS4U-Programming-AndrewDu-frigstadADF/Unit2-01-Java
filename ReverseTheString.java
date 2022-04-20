/** learning recursions by reversing a string
 * 
 * Author Andrew Du-frigstad
 * version 1
 * since   2022-04-19
**/

// imports
import java.io.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReverseTheString {
    
    // function to reverse the string
    public static String reverse(String someString) {

        String reverseString = "";

        // if the string is 0 then do nothing
        if (someString.length() == 0) {

            return someString;

        } else {

            // For how long the original string is going backwards
            for (int i = someString.length() -1; i>= 0; i--) {

                // put the character at that index into the reversed string
                reverseString = reverseString + someString.charAt(i);

            }

            return reverseString;
        }

    }
    
    public static void main(String[] args) throws IOException {

        Path someFile = Path.of("C:\\Users\\andye\\ICS4U\\Unit2-01-Java\\string.txt");
        String someString = Files.readString(someFile);

        // print the original string
        System.out.println(someString);
    
        // call the function and print the reversed string
        String reversedString = reverse(someString);
        System.out.println(reversedString);
    }
}
