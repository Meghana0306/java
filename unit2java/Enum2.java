enum Season{
    WINTER, SPRING, SUMMER, FALL
}
public class Enum2 {
    
    public static void main(String[] args) {
        for(Season s:Season.values()){
            System.out.println(s);
        }
        System.out.println("Value of Winter is "+Season.valueOf("WINTER"));
        System.out.println("Index of Winter is "+Season.valueOf("WINTER").ordinal());
        System.out.println("Value of Summer is "+Season.valueOf("SUMMER").ordinal()); }
}
