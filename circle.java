package mypackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class circle
{
    public static int add(int...n)
    {
        int sum=1,k;
        for(k=0;k<n.length;k++)
        {
            sum=sum+n[k];
        }
        return sum;
    }
    public static int product(int ...n)
    {
        int p=1,k;
        for(k=0;k<n.length;k++)
        {
            p=p*n[k];
        }
        return p;
    }
    public static void area(int r)
    {
        double a = 3.14*r*r;
        System.out.println("area of circle= "+a);
    }
    public static void perimeter(int r)
    {
        double b = 2*3.14*r;
        System.out.println("perimeter of circle= "+b);
    }
    public static void main(String[] args) throws IOException
    {
        System.out.print("Enter the value of radius= ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int r =Integer.parseInt(br.readLine());
        circle c = new circle();
        int ad = c.add(10,20,30,40);
        System.out.println("sum of number = "+ad);
        int i=c.product(2,2,2,2,2,2,2,2,2);
        System.out.println("products of numbers = "+i);
        c.area(r);
        c.perimeter(r);
    }
}