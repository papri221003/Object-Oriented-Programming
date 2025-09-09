import java.util.Scanner;
class func_Overloading{
    float r,a,b;
    public void Area(float radius)
    {
        this.r=radius;
        double area=(3.14*r*r);
        System.out.println("The area of the circle is: "+area);
    }
   public void Area(float height,float base)
    {
        this.a=height;
        this.b=base;
        double area=0.5*a*b;
        System.out.println("The area od triangle is: "+area);
    }


}


public class oops5_Polymorphism_compileTime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float radius=sc.nextFloat();
        float hl=sc.nextFloat();
        float bw=sc.nextFloat();
        func_Overloading obj=new func_Overloading();
        obj.Area(radius);
        obj.Area(hl,bw);
    }

}
