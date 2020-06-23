//package Java_Project;
import java.lang.Math;

public class NPC {
    
    public static void main(String args[]){

        //Debug
        /*for(int i = 0; i < 101; i++){
            Blacksmith();
        }*/


    }

    public static void Villager(){

        int randy = ((int)Math.random() * 5);

        switch (randy){
            case 0:
            System.out.println("Good day!");
            break;
            case 1:
            System.out.println("Did you know there's a blacksmith in town? He's located further up the road!");
            //return Player.blacksmith = true;
            break;
            case 2:
            System.out.println("This weather we're having is great, isn't it?");
            break;
            case 3:
            System.out.println("Hi! I'm a villager here, what do you do?");
            case 4:
            System.out.println("Hey, did you know that we're surrounded by forests?");
            System.out.println("If you go out, you can gather sticks and stones there.");
            break;
        }
    }
    public static void Blacksmith(){

        int randy = ((int)(Math.random() * 3));
        //int x = 2;

        switch (randy){
            case 0:
            System.out.println("Hello! What can I do for you?");
            break;
            case 1:
            System.out.println("Hey! What do you need?");
            break;
            case 2:
            int order = (int)(Math.random()*9002);
            if(order > 9000){
                System.out.println("Villager! What does the scouter say about his order number?");
                System.out.println("IT'S OVER 9000!!!!");
                System.out.println("WHAT?! 9000");

            }
            if(order == 66){
                System.out.println("Execute order 66");
                
            }else{
            System.out.println("Order number "+order+"! What can I do for you?");
            }
            break;
        }






    }
    
}