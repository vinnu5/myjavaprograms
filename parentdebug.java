package mypackage;

class vin5 {    // parent
    public int cal(int x, int y){
        int d=4;
        return x+y;
    }
}

class ra1 extends vin5{
    public int cal_adv(int x, int y, int d){
        int sum=d+4;
        //ra1 s=new ra1();
        return x-y;
    }
}
class har1 extends ra1{
    public int cal2(int x,int y){
        return x*y;
    }
}
class  bg2 extends har1{
    public int cal3(int x, int y){
        return x%y;
    }
}
public class parentdebug{
    public static void main(String[] args) {
        ra1 a=new ra1();
        har1 h=new har1();
        bg2 g=new bg2();
        ra1 s=new ra1();
        System.out.println(a.cal(2,5));
        //  System.out.println(h.cal2(5 ,6);
        System.out.println(s.cal_adv(2,9,4));
        System.out.println((g.cal3(10,15)));
    }
}