import java.util.Scanner;
class constructor_newbuild{
    String name;
    int roll;
    String Sec;
   public constructor_newbuild()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number: ");
        float a=sc.nextFloat();
        System.out.println("Enter the second number: ");
        float b=sc.nextFloat();
        float avg= (a+b)/2;
        System.out.println("The avg marks is: "+avg);
    }
    void display()
    {
        System.out.println("Name of and roll of the student is: "+name+" "+roll);
    }
}
public class oops2_constructor_nonparameterised {
    public static void main(String[] args) {
        constructor_newbuild obj=new constructor_newbuild();
        obj.name="Papri";
        obj.roll=27;
        obj.Sec="A";
        obj.display();
    }
}
