//To invoke paren class method
class car{
    void start()
    {
        System.out.println("Car is starting..........");
    }
}
class car2 extends car{
    void start()
    {
        System.out.println("Car2 is starting..........");
        super.start();
    }
}
public class superKeyword1 {
    public static void main(String[] args) {
        car2 obj=new car2();
        obj.start();



    }
}
