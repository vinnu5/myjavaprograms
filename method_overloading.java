package mypackage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class method_overloading {
    public static void lap1() {
        System.out.println("vinay");
    }
       public static void lap1(int x, int y){
        System.out.println(x*y);
        System.out.println(x%y);
       }
       public static void lap1(String str){
           System.out.println(str.length());
       }
       public static void main(String[] args) throws IOException{
        method_overloading mo = new method_overloading();
           int x ; int y;
           System.out.println("Enter your number");
           BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  // it will take input from the user
           x=Integer.parseInt(br.readLine());  // it will check the entered value is integer or not
           y=Integer.parseInt(br.readLine());
        mo.lap1();
        mo.lap1( x,y);
        mo.lap1("viinay");
       }
    }
