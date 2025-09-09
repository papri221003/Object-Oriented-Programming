interface animal{
    public void speak();
    public void eat();
}
class dog implements animal{
    public void speak()
    {
        System.out.println("Dog can bark");
    }
    public void eat(){
        System.out.println("Dog like to eat meat");
    }
}
class cat implements animal{
    public void speak()
    {
        System.out.println("Cat can meow");
    }
    public void eat(){
        System.out.println("Cat like to eat fish and milk");
    }
}
public class Interface {
    public static void main(String[] args) {
        dog d1=new dog();
        cat c1=new cat();

        d1.eat();
        c1.speak();

    }
}
