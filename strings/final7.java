package strings;
class A{
    final void m1(){
        System.out.println("This is a final method.");
    }
}

 class final7 extends A{
    void m1(){
        System.out.println("Illegal");
    }
    public static void main(String[] args) {// it wills show error we cannot override 
        
    }
}
