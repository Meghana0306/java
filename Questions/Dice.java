package Questions;
import java.util.Random;
import java.util.Scanner;
public class Dice {
    public static void main(String[] args){
        
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);
    int value;
    System.out.println("press enter to roll the dice..");

    do{
        sc.nextLine();
        value = rand.nextInt(6)+1;
        System.out.println("You rolled: "+value);
        if(value != 6){
            System.out.println("roll again: ");

        }

    }while(value!=6);
    System.out.println("You won");
    sc.close();
    
}}


