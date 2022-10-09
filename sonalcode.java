package mypackage;

public class sonalcode
{
    public static String test(String a,String b)
    {
        String str = a+b;
        return str;
    }
    public static String test1(String a,String b)
    {
        String str1 = a+b;
        return str1;
    }
    public static void main(String[] args)
    {
        String A = test("hello","123");
        String s1 = test1("good","morning");
        System.out.println(A);
        System.out.println(s1);
    }
}