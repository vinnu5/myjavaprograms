package mypackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class switches {

    public static void main(String[] args) throws IOException {
        int day;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the week num");
        day=Integer.parseInt(br.readLine());
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wedday");
                break;
            default:
                System.out.println("you have entered a wrong day");
        }
    }
}