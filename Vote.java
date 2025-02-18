package Questions;
import java.util.Scanner;


public class Vote{
    public static void main(String args[]){
        System.out.println("age:");
    Scanner sc = new Scanner(System.in);


    int a=sc.nextInt();
    sc.nextLine();
    System.out.println("Nationality:");
    String b = sc.nextLine();
    if(a>=18 || b.equalsIgnoreCase("Indian")){
        System.out.println("Eligible to vote");
    }
    else{
        System.out.println("Not eligible");
    }
    
}}






