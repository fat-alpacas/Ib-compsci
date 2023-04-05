import java.util.Random;


public class Rolldice {

    public static void main (String[] args){
        class die{
            int faceValue;

            public void roll()

            {
                faceValue = (int)(Math.random()*6+1);

                System.out.println("the value is" + faceValue);
            }
        }
            die firstroll = new die ();

            die secoundroll = new die();
            die thirdroll = new die();
            die fourthroll = new die();
            die fithroll = new die();

            firstroll.roll();
            secoundroll.roll();
            thirdroll.roll();
            fourthroll.roll();
            fithroll.roll();

    }
}