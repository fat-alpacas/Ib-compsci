import java.util.Random;


public class Rolldice {

    public static void main (String[] args){
       class die{
            int faceValue;
            int faceValue2;
            public void roll(){

            
                faceValue = (int)(Math.random()*6+1);
                faceValue2 = (int)(Math.random()*6+1);
                System.out.println("the value is " + faceValue + " And " + faceValue2);
            }
     
     public int getfaceValue(){
        return faceValue;
     }    
        }
            die firstroll = new die ();
            die secoundroll = new die();
            die thirdroll = new die();
            die fourthroll = new die();
            die fithroll = new die();
        int rollcount = 0;
        while (true){
            
          int firstValue = faceValue.getfaceValue();
          int secoundValue = faceValue2.getfaceValue();
         

        
            
            System.out.println("First roll was " + firstroll);
            System.out.println("Secound roll was " + secoundValue);
            System.out.println("So far you have rolled " + rollcount + "times");
        
            rollcount++;
        }
    if (firstValue == secoundValue) {
        System.out.println("The rolls are the same and it only took" + rollcount + "times" );
    }import java.util.Random;

public class Rolldice {

    public static void main(String[] args) {

        class Die {

            private int faceValue;

            public void roll() {

                faceValue = (int) (Math.random() * 6 + 1);

            }

            public int getFaceValue() {

                return faceValue;

            }

        }

        Die firstRoll = new Die();

        Die secondRoll = new Die();

        int rollCount = 1;

        while (true) {

            firstRoll.roll();

            secondRoll.roll();

            int firstValue = firstRoll.getFaceValue();

            int secondValue = secondRoll.getFaceValue();

            System.out.println("First roll: " + firstValue);

            System.out.println("Second roll: " + secondValue);

            System.out.println("So far, you have rolled " + rollCount + " times.");

            if (firstValue == secondValue) {

                System.out.println("The rolls are the same, and it took " + rollCount + " times.");

                break;

            }

            rollCount++;

        }

    }

}
    

}
}
