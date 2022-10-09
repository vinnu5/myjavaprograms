package mypackage;

class ed{    // parent
    public int cal(int x, int y){
        return x*y;
    }
}

class gd1 extends ed {      //child
    public int cal2(int x, int y) {
        return x - y;
    }
}
class ed2 extends gd1{
        public int cal1(int x , int y){
            return x+y;
        }
}

public class parentchild {
    public static void main(String[] args) {
        ed2 b=new ed2();
        // object of child
        System.out.println(b.cal(12,5));
        System.out.println(b.cal2(10,11));
        System.out.println(b.cal1(10,11));
    }
}