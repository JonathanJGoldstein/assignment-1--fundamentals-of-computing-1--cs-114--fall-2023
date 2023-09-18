// Import libraries here
import java.lang.Math;
// Jonathan Goldstein

public class Assignment1 {
  public static void main(String[] args) {
    // Add your code here
    var inString = System.console().readLine("Please enter a 5-character string:\n");
    var Fahrenheit = System.console().readLine("Enter Fahrenheit value:\n");
    
    int out = SToInt(Fahrenheit);
    System.console().printf("%d", out);
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
