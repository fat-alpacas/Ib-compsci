import java.io.*;

public class Dog {
    // instance variables
    private String breed;
    private String name;
    private int age;

    public Dog() {
        breed = "";
        name = "";
        age = 0;
    }

    public Dog(String b) {
        breed = b;
        name = "";
        age = 0;
    }

    public Dog(String b, String n) {
        breed = b;
        name = n;
        age = 0;
    }

    public Dog(String b, String n, int a) {
        breed = b;
        name = n;
        age = a;
    }

    public String toString() {
        return "Breed: " + breed + ", Name: " + name + ", Age: " + age;
    }

    public void Wright(String filename) {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(filename));
            writer.println(this.toString());
            writer.close();
            System.out.println("Data written to " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("Golden Retriever");
        Dog dog3 = new Dog("Collie", "Lassie");
        Dog dog4 = new Dog("German Shepherd", "Max", 3);

        dog1.Wright("dog1.txt");
        dog2.Wright("dog2.txt");
        dog3.Wright("dog3.txt");
        dog4.Wright("dog4.txt");
    }
}
