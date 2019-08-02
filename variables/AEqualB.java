public class AEqualB {
  public static void main(String[] args) {
    int a = 5;
    int b = 10;
    int c;

    c = b;
    b = a;
    a = c;

    System.out.println("B = " + b);
    System.out.println("A = " + a);
  }
}