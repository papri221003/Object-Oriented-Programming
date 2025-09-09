import java.util.Scanner;
class constructor_parameterised
{
    int i;
    int num;
    constructor_parameterised(int num)
    {
        this.num=num;
        boolean flag=false;

        if(num<=1)
        {
            System.out.println("The number is not prime");
        }
        for(i=2;i<num;i++)
        {
            if(num%i==0)
            {
                flag=true;
                break;
            }
        }
        if(flag==true)
        {
            System.out.println("The number is not Prime number");
        }
        else {
            System.out.println("The number is a Prime number");
        }

    }

}

public class oops2_constructor_parameterised {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("The number to be checked: ");
        int number= sc.nextInt();

        constructor_parameterised obj=new constructor_parameterised(number);
    }
}
