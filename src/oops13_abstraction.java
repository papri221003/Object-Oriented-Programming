abstract class Animal{
    abstract void walk();
    Animal()
    {
        System.out.println("You are creating a animal class");
    }
    public void eat()
    {
        System.out.println("Animals can eat");
    }
}
class horse extends Animal{
    horse()
    {
        System.out.println("I am a horse");
    }
    public void walk() {
        System.out.println("It has 4 legs");
    }
}
class chikken extends Animal{

    public void walk() {
        System.out.println("It has 2 legs");

    }
}

public class oops13_abstraction {
    public static void main(String[] args) {
        horse h =new horse();
        h.eat();
        h.walk();

    }
}
