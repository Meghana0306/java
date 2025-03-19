package strings;

 class Base {
    int a,b;
    Base(int x,int y){
        a=x;
        b=y;
    }
    void display(){
        System.out.println("base class is="+a+" "+b);
    }
}
class Derived1 extends Base{
int num,num1;
Derived1(int x, int y, int z){
    super(x,y);
    num =z;
    num1=x+y+num;
}
void display(){
    super.display();
    System.out.println("derived output is"+num1);
}
}
class overriding{
    public static void main(String args[]){
        Derived1 ob = new Derived1(10,20,5);
        ob.display();
    }
}
