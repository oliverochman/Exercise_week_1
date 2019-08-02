import java.util.Scanner;

public class IntToString {
  public static void main(String[] args) {
    System.out.println("Skriv ett tal mellan 0-10");

    Scanner input = new Scanner(System.in);

    int number = input.nextInt();

    if(number == 10) {
        System.out.println("Tio");
    } else if(number == 9) {
        System.out.println("Nio");
    } else if(number == 8) {
        System.out.println("Åtta");
    } else if(number == 7) {
        System.out.println("Sju");
    } else if(number == 6) {
        System.out.println("Sex");
    } else if(number == 5) {
        System.out.println("Fem");
    } else if(number == 4) {
        System.out.println("Fyra");
    } else if(number == 3) {
        System.out.println("Tre");
    } else if(number == 2) {
        System.out.println("Två");
    } else if(number == 1) {
        System.out.println("Ett");
    } else if(number == 0) {
      System.out.println("Noll");
    } else {
      System.out.println("Du kan endast skriva ett tal mellan 0-10");
    }
  }
}