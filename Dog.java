import java.io.*;

import javax.imageio.stream.ImageInputStream;

public class Dog {

    private String breed;
    private String name;
    private int age;
    private int numDogs;

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

    public static void maim(String[]args){
        BufferedReader reader = new BufferedReader((Reader) new ImageInputStream(System.in)); {
            int numDogs = 0;
            System.out.println("How Many dogs?");
            try{
                numDogs = Integer.parseInt(reader.readLine());
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    
    
    }
    Dog[] dogs = new Dog[numDogs];{
    for (int i = 0; i < numDogs; i++) {
        System.out.println("enter dog breed"+ (i+1) + ":");
        String breed = "";
        try{
            breed = Reader.readLine();
        }    catch (IOException e){
                e.printStackTrace();
            }
        dogs[i] = new Dog(breed);
        System.out.println("files printed");
        }
    
}
}