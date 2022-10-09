package mypackage;

public class array {

    public static void main(String[] args) {
        int[] i = new int[10];
        i[0]=1;i[1]=10;i[2]=11;i[3]=12;i[4]=13;
        System.out.println(i.length);
        for(int j=0;j<6;j++){
            System.out.println(i[j]);
        }
    }
}