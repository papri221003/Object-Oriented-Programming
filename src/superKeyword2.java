class Human{
    Human()
    {
        System.out.println("I am a human.....");
    }
}
class youtuber extends Human{
    youtuber()
    {
        super();
        System.out.println("I am a youtuber.....");
    }
}
public class superKeyword2 {
    public static void main(String[] args) {
        youtuber you=new youtuber();

    }
}
