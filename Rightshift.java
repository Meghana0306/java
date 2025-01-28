public class Rightshift {
    public static void main(String args[]){
        int a =5;
        int b=4;
        int c = a>>1;
        System.out.println("a>>1 is: "+c);
        System.out.println("Binary value a>>1: "+Integer.toBinaryString(c));//this is the binary value after the right shift which is 010 
    }
}
