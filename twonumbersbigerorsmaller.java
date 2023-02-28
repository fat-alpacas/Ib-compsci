import java.util.Scanner;


public class twonumbersbigerorsmaller{
    public static void main(String[]arrgs){

    int num1, num2;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter first number");
    num1 = sc.nextInt();
    System.out.println("enter secound number");
    
    num2 = sc.nextInt();
    if (num2 > num1){
        System.out.println(num2+"is greater then"+num1);
    }
    else if(num1 > num2){
         System.out.println(num1+"is greater then"+num2);
    }
    else if(num1 == num2){
         System.out.println("the numbers are the same");
    }

    }
}