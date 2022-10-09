package mypackage;

public class varnum {
    public static int sum(int... numbers) {
        int sum = 0;
        for (int j = 0; j < numbers.length; j++) {

            sum = sum + numbers[j];
        }
        return sum;
    }

    public static void main(String[] args) {
        varnum vn = new varnum();
        System.out.println( vn.sum( 1, 2, 3, 4, 5));
    }
}