import java.util.Scanner;

public class CummulativeProject {


 public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String name;
    System.out.println("What is you name?");
    name = scanner.nextLine();
    System.out.println("your name is" + name);

    int hellotimes;
    System.out.println("Hello " + name + " How many times to say hello");
    hellotimes = scanner.nextInt();
    
    for (int i = 0; i< hellotimes; i++){
        System.out.println("Hello " + name + " this is hello # " + (i+1));

   }
   String myname =new String ("Alec");
   if(name.equalsIgnoreCase(myname)){
    System.out.println("thats my name to"); 
   }
   else {
    System.out.println("well its not a great name but it will do");
   }
   
 System.out.println("what mark the user got in computer class");
int mark = scanner.nextInt();
if (mark > 70 ) {
    System.out.println("You got a A");
} else if (mark >60){
    System.out.println("You got a B");
}  else if (mark >50){
        System.out.println("You got a c");
    } else{
            System.out.println("You got a D");
        }
        int attempts = 0;
        String pasward;
        do{
            System.out.println("enter pasward");
            pasward = scanner.next();
            attempts++;
        } while (!pasward.equals("computing") && attempts <5);
        {
            if (pasward.equals("computing")){
            System.out.println("Succses");
        } else {
            System.out.println("failed after 5 tries");
        }
}
}
}