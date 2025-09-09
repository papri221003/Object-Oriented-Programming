class person{
    private String name="Papri";
    private int age=21;
    public String getName()
    {
        return this.name;
    }
    public int getAge()
    {
        return this.age;
    }
}

public class oops_encapsulation_readonly {
    public static void main(String[] args) {
        person p=new person();
        System.out.println(p.getName());
        System.out.println( p.getAge());


    }
}
