public class Enum1 {
    enum Season{
        WINTER, SPRING, SUMMER, FALL;
    }
    public static void main(String[] args) {
        for(Season s:Season.values())
        System.out.println(s);

    }
}
