import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
class class_obj{
    String name;
    int roll;
    String Sec;
    float marks_avg()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number: ");
        float a=sc.nextFloat();
        System.out.println("Enter the second number: ");
        float b=sc.nextFloat();
        float avg= (a+b)/2;
        return avg;
    }
    void display()
    {
        System.out.println("Name of and roll of the student is: "+name+" "+roll);
    }
}

public class oops1_class {
    public static void main(String[] args) {
        class_obj obj=new class_obj();
        obj.name="Papri";
        obj.roll=27;
        obj.Sec="A";
        obj.display();
        float total=obj.marks_avg();
        System.out.println("The avg number betweeen this two is: "+total);
    }
}
