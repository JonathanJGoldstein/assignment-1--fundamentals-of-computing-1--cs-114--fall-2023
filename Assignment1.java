// Import libraries here
import java.lang.Math;
import java.util.Random;
// Jonathan Goldstein

public class Assignment1 {
  public static void main(String[] args) {
    int randnum = 0;
    Random randgen = new Random();

    var invString = "";
    var finalString = "";
    
    float Celsius = 0;
    //get user values
    var inString = System.console().readLine("Please enter a 5-character string:\n");
    var Fahrenheit = System.console().readLine("Enter Fahrenheit value:\n");
    
    //get int version of Fahrenheit
    int out = SToInt(Fahrenheit);
    
    //convert Fahrenheit to Celsius
    Celsius = ((out - 32) * 5) / 9;

    //invert inString
    for (int i = inString.length(); i > 0; i--){
      invString = invString.concat(inString.substring(i-1, i));
    }
    //remove first and last char
    invString = invString.substring(1, invString.length()-1);

    //generate a random number between 32 & 16384 (Inclusive)
    randnum = randgen.nextInt(32, 16385);
    
    //Generate final string
    finalString = finalString.concat(String.valueOf(Celsius).concat(invString.concat(String.valueOf(randnum))));
    System.console().printf(finalString);
  }



  //Convert a string to an integer
  static int SToInt(String in){
    //variable to store final int
    int final_val = 0;

    for (int i = 0; i < in.length(); i++){
      //Get current int in string, then multiply by its ten's power
      final_val += ( (in.charAt(i)-48) * (Math.pow(10, in.length()-(i+1))) );
    }
    return final_val;
  }
}
