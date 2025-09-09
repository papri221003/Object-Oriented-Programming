import java.util.Scanner;
class cons_overloading{
    String name;
    int roll;
    String sec;
    int total_marks;
    cons_overloading(String n,String s,int t)
    {
        this.name=n;
        this.sec=s;
        this.total_marks=t;
        System.out.println(name+" "+sec+" "+total_marks);
    }
    cons_overloading(int r,int t2)
    {
        this.roll=r;
        this.total_marks=t2;
        System.out.println(roll+" "+total_marks);
    }
}
public class oops4_ConsOverloading {
    public static void main(String[] args) {
        cons_overloading s1=new cons_overloading("Papri","A",658);
        cons_overloading s2=new cons_overloading(27,658);

    }
}
