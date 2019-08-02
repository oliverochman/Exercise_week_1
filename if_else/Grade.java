import java.util.Scanner;

public class Grade {
  public static void main(String[] args) {
    System.out.println("Skriv in elevens provpoäng");

    Scanner input = new Scanner(System.in);

    int score = input.nextInt();

    if(score >= 50) {
        System.out.println("Godkänt");
    } else {
        System.out.println("Underkänt");
    }
  }
}