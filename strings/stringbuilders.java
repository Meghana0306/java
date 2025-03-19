package strings;

public class stringbuilders {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        System.out.println("String length = "+s1.length());
        System.out.println("Charector at position:"+s1.charAt(3));
        System.out.println("Substring ="+s1.substring(3));
        System.out.println("Substring ="+s1.substring(2,4));
        System.out.println("Concatenated String ="+s1.concat(" "+s2));
        String s4 = "Learn Share Learn";
        System.out.println("Index of Share: "+s4.indexOf("Share"));
        System.out.println("Index of a: "+s4.indexOf('a',9));
        System.out.println(s1.equals(s2));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println("Java".equalsIgnoreCase("jAVa"));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.trim());
        System.out.println(s1.contains("l"));
        System.out.println(s1.replace('l','p'));
        System.out.println(s1.replaceAll("[aeiou]","@"));


    }
}
