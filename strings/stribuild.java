package strings;

public class stribuild {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Learning");
        System.out.println("Initial Stingbuilder: "+sb);
        sb.append(" is awesome!");
        System.out.println("After append: "+sb);
        sb.insert(9,"java");
        System.out.println("After insert: "+sb);
        sb.replace(0,5,"Welcome to");
        System.out.println("After replace: "+sb);
        sb.delete(8,10);
        System.out.println("After delete: "+sb);
        sb.reverse();
        System.out.println("After reverse: "+sb);
        int length = sb.length();
        System.out.println("Current length: "+length);
        char charAt5 = sb.charAt(5);
        System.out.println("Charecter at index 5: "+charAt5);
        sb.setCharAt(5,'X');
        System.out.println("After setCharAt: "+sb);
        String substring  =sb.substring(5,10);
        System.out.println("Substring(5 to 10): "+substring);
        sb.deleteCharAt(5);
        System.out.println("After deleteCharAt: "+sb);
        String result = sb.toString();
        System.out.println("Final: "+result);
        sb.reverse();
        System.out.println("After all things and reversing: "+sb);

    }
}
