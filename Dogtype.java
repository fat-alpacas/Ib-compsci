import java.io.*;

class Dog
{

    private String breed;
    private String name;
    private int age;

    public Dog()
    {
        breed = "";
        name = "";
        age = 0;
    }

    public Dog(String b)
    {
        breed = b;
        name = "";
        age = 0;
    }

    public Dog(String b, String n)
    {
        breed = b;
        name = n;
        age = 0;
    }

    public Dog(String b, String n, int a)
    {
        breed = b;
        name = n;
        age = a;
    }

    public void print()
    System.out.println(dog1);
    System.out.println(dog2);
    System.out.println(dog3);
    System.out.println(dog4);
    }
    public class Dogtype
    {
    public void main(String [] args)
    {
        Dog dog1 = new Dog();
       dog1.print();
        Dog dog2 = new Dog("Golden Retriever");
        Dog dog3 = new Dog("Collie", "Lassie");
        Dog dog4 = new Dog("German Shepherd", "Max", 3);
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);
    
    } 
}
    public void wright(String filename) {
    try{
        PrintWriter writer = new PrintWriter(new FileWriter(filename));
        writer.println(this.toString());
        writer.close();
        System.out.println("data writen to file" + filename);
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
}




