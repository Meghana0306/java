package unit2java;

public class incre {
    public static void main(String args[]){
        int x=2;
        int y=3;
        if(--x > y++) y++;
        else if(x<--y) x++;
        else y--;
        System.out.println(x+" "+y);
    }
}
