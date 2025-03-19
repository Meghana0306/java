package strings;

public class someth {
    public static void main(String[] args) {
        long startTime1 = System.nanoTime();
        String s1 = new String();
        for(char arr='a'; arr<='z';arr++){
            s1 = s1+arr;
        }
        long endtime1 = System.nanoTime();
        long elapsedtime1 = endtime1 - startTime1;
        System.out.println(s1+" "+elapsedtime1+" "+"nanoseconds");
        long startTime2= System.nanoTime();
        StringBuilder s2 = new StringBuilder();
        for(char arr='a';arr<='z';arr++){
            s2 = s2.append(arr);
        }
        long endtime2 = System.nanoTime();
        long elapsedtime2 = endtime2 - startTime2;
        System.out.println(s2+" "+elapsedtime2+" "+" nanoseconds");
    }
}
