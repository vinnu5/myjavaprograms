package mypackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


  public class conditions {
     public static void main(String[] args) throws IOException {
       int age;
       System.out.println("enter your age");
       BufferedReader brd= new BufferedReader(new InputStreamReader(System.in));
       age=Integer.parseInt(brd.readLine());
       if (age>18){       // >=, <=
           System.out.println("elegible to vote");
       }
       else if (age<18){
           System.out.println("you are not eligible to vote");
       }
       else if(age==18) {
           System.out.println("wait for next birthday to vote");
       }
     }
  }