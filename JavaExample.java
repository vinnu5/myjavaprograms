package mypackage;

public class JavaExample
{
    public static void main(String args[])
    {
        int i, j , numberOfRows=4;
        for(i=0; i<numberOfRows; i++)
        {
            for(j=1; j<=i; j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}