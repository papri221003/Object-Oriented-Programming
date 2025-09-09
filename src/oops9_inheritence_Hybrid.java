class vehicle3{
    int wheelsno;
    String colour;
    void print()
    {
        System.out.println("I am one of the vehicle");
        System.out.println("My colour is: "+colour+" & I have "+wheelsno+" wheels");
    }
}
class twowheeler3 extends vehicle3{
    String speed;
    void display()
    {
        System.out.println("I have "+speed+" speed");
    }
}
class threeWheeler3 extends vehicle3{
    String speed2;
    void show()
    {
        System.out.println("I have "+speed2+" speed");
        System.out.println("I have 3types: Toto,Auto,Rickshaw");
    }
}
class fourwheeler3 extends vehicle3{
    String speed3;
    void show2()
    {
        System.out.println("I have "+speed3+" speed");
        System.out.println("Well known companies that made me are: Maruti Suzuki,Tata,Nano,Hyndai");
    }
}
class Toto extends threeWheeler3{
    String speed4;
    void show3()
    {
        System.out.println("I have "+speed4+" speed");
        System.out.println("I am eco friendly Threewheeler");
    }
}


public class oops9_inheritence_Hybrid {
    public static void main(String[] args) {
        Toto s1=new Toto();
        s1.colour="Yellow";
        s1.wheelsno=3;
        s1.speed4="slow";
        s1.print();
        s1.show3();

    }
}
