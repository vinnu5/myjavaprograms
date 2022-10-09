package mypackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bullean {
    public static void main(String[] args) throws IOException {
        int i ; int j;
        System.out.println("Enter your number");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  // it will take input from the user
        i=Integer.parseInt(br.readLine());  // it will check the entered value is integer or not
        j=Integer.parseInt(br.readLine());   // String.parseString()
        System.out.println(i>j);
        System.out.println(i==j);
        System.out.println(i<j);
        System.out.println(i!=j);
    }
}