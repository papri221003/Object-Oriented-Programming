import org.w3c.dom.ls.LSOutput;

class vehicle{
    int wheelsno;
    String colour;
    void print()
    {
        System.out.println("I am one of the vehicle");
        System.out.println("My colour is: "+colour+" & I have "+wheelsno+"  wheels");
    }
}
class twowheeler extends vehicle{
    String speed;
    void display()
    {
        System.out.println("I have "+speed+" speed");
    }
}

class bike extends twowheeler{
    void show()
    {
        System.out.println("I am running with the help of petrol and I am not a eco frendly vehicle as I create pollution");
    }

}


public class oops7_inheritence_multilevel {
    public static void main(String[] args) {
        bike s1=new bike();
        s1.colour="Black";
        s1.wheelsno=2;
        s1.speed="moderate";
        s1.print();
        s1.display();
        s1.show();

    }
}
