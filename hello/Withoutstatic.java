package hello;

public class Withoutstatic {
 
            void fun(int n){
            System.out.println(n);
        }
            void fun(int n,int n1){
            System.out.println(n+n1);
        }
            void fun(int n,int n1, int f){
            System.out.println(n+n1+f);
        }
        public static void main(String[] args) {
            Withoutstatic ob = new Withoutstatic();
           ob.fun(100);
           ob.fun(1,2);
           ob.fun(10,20,30);
           
            
            
                       
        }
}
