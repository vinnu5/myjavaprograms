package mypackage;

public class arrayprop {

    public static void main(String[] args) {
        int[] i = {1, 2, 3, 4, 5};
        int sum = 0;
        int prod = 1;
        for (int j = 0; j < i.length; j++) {
            sum = sum + i[j];
            prod = prod * i[j];
        }
        System.out.println("sum is -->"  +sum );
        System.out.println("product is--> " +prod);
    }
    }