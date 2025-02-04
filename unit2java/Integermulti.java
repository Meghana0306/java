import java.util.*;
public class Integermulti {
    
// You are using Java


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result = 1;
        while(a>0){
            int digit = a%10;
            if(digit!= 0){
               result*=digit; 
            }
            a/=10;
        }
        System.out.println(result);
    }




}
