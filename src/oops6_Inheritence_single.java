class vehicle1{
    int wheelsno;
    String colour;
    void print()
    {
        System.out.println("I am one of the vehicle");
        System.out.println("My colour is: "+colour+" & I have "+wheelsno+"  wheels");
    }
}
class twowheeler1 extends vehicle1{
    String speed;
    void display()
    {
        System.out.println("I have "+speed+" speed");
    }
}


public class oops6_Inheritence_single {
    public static void main(String[] args) {
        twowheeler1 s1=new twowheeler1();
        s1.colour="Black";
        s1.wheelsno=2;
        s1.speed="moderate";
        s1.print();
        s1.display();
    }
}
