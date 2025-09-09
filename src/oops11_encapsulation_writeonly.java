class person2{
    private String name;
    private int age;
    public void setName(String name)
    {
        this.name=name;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
}

public class oops11_encapsulation_writeonly {
    public static void main(String[] args) {
        person2 p=new person2();
        p.setName("papri");
        p.setAge(21);

    }
}
