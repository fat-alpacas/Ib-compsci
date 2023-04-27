class Dog
{
    // instance variables
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
System.out.println(dog1);
System.out.println(dog2);
System.out.println(dog3);
System.out.println(dog4);
}


public class Dogtype
{
public static void main(String [] args)
{
    Dog dog1 = new Dog();
    Dog dog2 = new Dog("Golden Retriever");
    Dog dog3 = new Dog("Collie", "Lassie");
    Dog dog4 = new Dog("German Shepherd", "Max", 3);
}
}
