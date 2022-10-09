package mypackage;

class madhu{
    int id;String name;int a;int b;int num;int r;int marks;
    public void print()
    {
        System.out.println("printing id number"+" "+id);
        System.out.println(name);
    }
    public void add()
    {
        int x=a+3;
        System.out.println((x));
    }

    public void table()
    {
        for(int k=0;k<10;k++)
        {
            System.out.println(num + "*" + (k + 1) + "=" + num * (k + 1));
        }
    }

    public void area()
    {
        double arg=3.14*r*r;
        System.out.println(arg);
    }
    public void result()
    {
        if(marks>80&&marks<100)
        {
            System.out.println("Excellent");
        }
        else
        {
            System.out.println("Prepare more");
        }
    }
}


public class madhavicode {
    public static void main(String[] args) {//int id;String name;int a;int b;int num;int r;int marks;

        madhu M=new madhu();
        M.id=123;  M.name="madhavilatha"; M.a=1;M.b=2;
        M.num=5;//table
        M.r=6;//radius
        M.marks=100;
        M.print();
        M.add();
        M.table();
        M.area();
        M.result();
    }
}
















