package mypackage;

public class usingreturn {
    public static int vin(int x, int y) {
        int c;
        c = x - y;
        return c;
    }

    public static void main(String[] args) {
        System.out.println(vin(-30, 5));
    }
}