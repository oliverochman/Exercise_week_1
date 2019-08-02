import java.util.Scanner;

public class IsItSexy {
  public static void main(String[] args) {
    System.out.println("Type a number");

    Scanner input = new Scanner(System.in);

    int firstInput = input.nextInt();

    System.out.println("Type a second number");

    int secondInput = input.nextInt();

    int potentialSexyNumber = firstInput + secondInput;

    boolean isNumberSexy;
    if(potentialSexyNumber == 6) {
      isNumberSexy = true;
    } else {
      isNumberSexy = false;
    }

    System.out.println("Is " + potentialSexyNumber + " sexy?");
    System.out.println(isNumberSexy);
  }
}