package hello;

public class MainOverload {
    static void Hi(int n){
        System.out.println(n);
    }
     void Hi(int n,int m){
        System.out.println(n+m);
     }
    public static void main(String[] args) {
        
        MainOverload ob=new MainOverload();
        ob.Hi(100,200);
        Hi(108);
        //System.out.println(ob.Hi);
    }
}
