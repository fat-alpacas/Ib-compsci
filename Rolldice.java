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
    }
    

}
}
