package hello;



public class Te3 {
    
    void fun(String a,int... n){
        System.out.print(a);
        int sum=0;
        for(int x:n){
            sum=sum+x;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Te3 ob = new Te3();
        ob.fun("Shivani ",100,20);
        ob.fun("Anil ",1,2,5);
        ob.fun("Anoop ",10,20,30,40);
    }

}
