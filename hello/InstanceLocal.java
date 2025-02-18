package hello;

public class InstanceLocal {
    int a ;               //instance vari
    InstanceLocal(int a)        //local vari
    {           
        this.a = a; // if we reomve this keyword here we will get zero in the output.
    }
    void show(){
        System.out.println(a);
    }
    public static void main(String[] args) {
        InstanceLocal r = new InstanceLocal(100);
        r.show();
    }

}
