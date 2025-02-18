package hello;

public class Overload {
    

    
    static void fun(int n){
        System.out.println(n); 
    }
    static void fun(int n,int n1){
        System.out.println(n+n1);
    }
    static void fun(int n,int n1, int f){
        System.out.println(n+n1+f);
    }
    public static void main(String[] args) {
        
        fun(100);
        fun(1,2);
        fun(10,20,30);
        
        
                   
    }



}
