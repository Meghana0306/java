package Questions;
import java.util.Scanner;
enum traficlight{
    //RED,YELLOW,GREEN;
    Monday,tuesday,wednesday,thursday,friday,saturday,sunday;
}
public class Traffic_lights {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
       // String input = s.next().toUpperCase();
       String input = s.nextLine();
        traficlight signal = traficlight.valueOf(input);
        /*switch(signal){ 
            case RED:
            System.out.println("Stop");
            break;
            case YELLOW:
            System.out.println("wait");
            break;
            case GREEN:
            System.out.println("go");
            break;
            default:
            System.out.println("Wrong input");
        }*/
        System.out.println(input);

    }
}
