import java.util.Scanner;

/**
 * Calculates the value of an entered Fibonacci number using an array
 * @author Cole Girling
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //scanner for user input
    Scanner input = new Scanner(System.in);

    //asks the user which fibonacci number they would like to find
    System.out.println("What Fibonacci number would you like to find");
    int userNumber = input.nextInt();

    //this is used to keep the original number the user entered
    int userNumber2 = userNumber + 1;

    //store the fibonacci numbers in an array
    int[] fibonacciNumbers = new int[userNumber2];

    //sets the first number in the array to 0
    fibonacciNumbers[0] = 0;
    //sets the second number in the array to 1
    fibonacciNumbers[1] = 1;

    //calculates the fibonacci number by taking the 2 previous numbers in the array and adding them together to create the fibonacci number. i starts at 2 because the first 2 groups in the array are filled
    for(int i = 2; i < userNumber2; i++){
      fibonacciNumbers[i] = fibonacciNumbers[i - 2] + fibonacciNumbers[i - 1];
    }
    
    //prints the fibonacci number to the screen
    System.out.println("The " + userNumber + " Fibonacci number is " + fibonacciNumbers[userNumber]);
  }
}
