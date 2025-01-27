import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        sc.nextLine(); 

        String b = sc.nextLine();

        System.out.printf("The number: %d%n", a);
        System.out.printf("The string: %s%n", b);
        
        sc.close(); 
    }
}
