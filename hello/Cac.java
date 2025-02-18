package hello;
 class Method1 {
    int a;
     String b;
    Method1(){
        a=10 ;
         b = "learn";
        System.out.println(a+" "+b);
    }
    Method1(Method1 ref){
        a = ref.a;
        b= ref.b;
        System.out.println(a+" "+b);
    }
}
public class Cac{
    public static void main(String[] args) {
        Method1 r = new Method1();
        Method1 r2 = new Method1(r);
    }
}
