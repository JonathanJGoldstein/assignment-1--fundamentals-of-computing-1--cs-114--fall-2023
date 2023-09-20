// Import libraries here
import java.lang.Math;
import java.util.Random;
// Jonathan Goldstein



public class Assignment1 {
  public static void main(String[] args) {
    int randNum = 0;
    Random randGen = new Random();
    var inString = "";
    var invString = "";
    var finalString = "";

    var Fahrenheit_String = "";
    int Fahrenheit_Int = 0;
    float Celsius = 0;
    var Celsius_Round = "";




    //print Block letters
    System.out.print("JJJJJJJJJJJJ     GGGGGGGGGGG\n");
    System.out.print("     JJJ        GGG       GGG\n");
    System.out.print("     JJJ       GGG         GG\n");
    System.out.print("     JJJ      GGG      \n");
    System.out.print("JJ   JJJ       GGG      GGGGGGG\n");
    System.out.print("JJJ  JJJ        GGG      GGG\n");
    System.out.print(" JJJJJJ           GGGGGGGG\n");


    //get user values
    inString = System.console().readLine("Please enter a 5-character string:\n");
    Fahrenheit_String = System.console().readLine("Please enter a number \033[0;31min \033[0mFahrenheit:\n");

    //get int version of Fahrenheit
    Fahrenheit_Int = SToInt(Fahrenheit_String);

    //convert Fahrenheit to Celsius
    Celsius = ((float)(Fahrenheit_Int - 32) * 5) / 9;

    //invert inString
    for (int i = inString.length(); i > 0; i--){
      invString = invString.concat(inString.substring(i-1, i));
    }

    //remove first and last char
    invString = invString.substring(1, invString.length()-1);

    //generate a random number between 32 & 16384 (Inclusive)
    randNum = randGen.nextInt(32, 16385);
    System.out.print("Random number generated. Continuing...\n");

    //convert Celsius to string and round to the nearest tenth
    Celsius_Round = String.valueOf(Celsius).substring(0, String.valueOf(Celsius).indexOf('.')+2);

    //Generate final string
    finalString = finalString.concat(Celsius_Round.concat(invString.concat(String.valueOf(randNum))));
    System.out.print("Your new string is " + finalString);
  }



  //Converts a string to an integer
  static int SToInt(String in){

    //variable to store final int
    int final_val = 0;

    //loop through all chars
    for (int i = 0; i < in.length(); i++){

      //Get current int in string, then multiply by its ten's power, then store it in the final_val integer
      final_val += ( (in.charAt(i)-48) * (Math.pow(10, in.length()-(i+1))) );
    }

    return final_val;
  }


}
