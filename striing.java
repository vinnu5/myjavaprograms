package mypackage;

public class striing {

    public static void main(String[] args) {
        String str = "VIsakhapatnam"; String str1 = "VInay";
        char ch = ' ';
        System.out.println(str.length()); //used for printing length of string
        System.out.println(str.toUpperCase());
        System.out.println(str.replace('I' ,'i'));
        System.out.println(str+ch+str1);
        System.out.println(str1);
        System.out.println(str.equals(str1));
        System.out.println(str.charAt(5));
        System.out.println(str.substring(3,5));

    }
}