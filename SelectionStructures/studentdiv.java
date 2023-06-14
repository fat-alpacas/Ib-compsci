import java.util.Scanner;

class studentdiv {

  public static void main(String[] args) {

    int m1, m2, m3, percent;

    System.out.println("enter your marks in 3 subjects");

    Scanner obj = new Scanner(System.in);

    m1 = obj.nextInt();

    m2 = obj.nextInt();

    m3 = obj.nextInt();

    percent = (m1 + m2 + m3) * 100 / 300;

    if (percent >= 60)

      System.out.println("First div");

    if ((percent >= 50) && (percent < 60))

      System.out.println("Second div");

    if ((percent >= 40) && (percent < 50))

      System.out.println("third div");

    if (percent < 40)

      System.out.println("fail");

  }

}