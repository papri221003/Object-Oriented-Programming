class vehicle2{
    int wheelsno;
    String colour;
    void print()
    {
        System.out.println("I am one of the vehicle");
        System.out.println("My colour is: "+colour+" & I have "+wheelsno+"  wheels");
    }
}
class twowheeler2 extends vehicle2{
    String speed;
    void display()
    {
        System.out.println("I have "+speed+" speed");
    }
}
class threeWheeler extends vehicle2{
    String speed2;
    void show()
    {
        System.out.println("I have "+speed2+" speed");
        System.out.println("I have 3types: Toto,Auto,Rickshaw");
    }
}
class fourwheeler extends vehicle2{
    String speed3;
    void show2()
    {
        System.out.println("I have "+speed3+" speed");
        System.out.println("Well known companies that made me are: Maruti Suzuki,Tata,Nano,Hyndai");
    }
}

public class oops8_inheritence_hierarchical {
    public static void main(String[] args) {
        fourwheeler s1=new fourwheeler();
        s1.colour="Black";
        s1.wheelsno=4;
        s1.speed3="high";
        s1.print();
        s1.show2();

    }
}
