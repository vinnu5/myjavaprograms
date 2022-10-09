package mypackage;
class ch{
    private int id; private int salary;   // access modifier public, pivate, defalut, protected
    public void set(int i,int j){   //i=2345;
        id=i;                    //id=i=2345; id=2345;
        salary=j;


    }
    public int get(){
        return id;

    }
    public int getSalary(){
        return salary;
    }
}
public class getter_setter {
    public static void main(String[] args) {
        ch c=new ch();
        c.set(005,44000);

        System.out.println(c.getSalary());
        System.out.println(c.get());

    }
}







