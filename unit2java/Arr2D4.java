
import java.util.Scanner;
public class Arr2D4{
 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int arr[][] = new int[3][3];
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            arr[i][j] = sc.nextInt();
        }
       
    }
    System.out.println("Array elements are: ");

    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println(" ");
    }
    
 }   
}
