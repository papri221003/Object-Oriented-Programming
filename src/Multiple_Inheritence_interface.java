interface A{
    public void speak();
    public void eat();
}
interface B{
    public void speak();
    public void display();
}

class C implements A ,B{
    public void speak()
    {
        System.out.println("C can bark");
    }
    public void eat(){
        System.out.println("C like to eat meat");
    }
    public void display()
    {
        System.out.println("I am C");
    }
}
public class Multiple_Inheritence_interface {
    public static void main(String[] args) {
        C obj=new C();
        obj.display();
        obj.eat();
        obj.speak();

    }
}
