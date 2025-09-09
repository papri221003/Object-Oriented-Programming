class copy_constructor_newbuild{
    String name;
    int roll;
    String sec;
    copy_constructor_newbuild(String n,int r,String s)
    {
        this.name=n;
        this.roll=r;
        this.sec=s;
    }
    copy_constructor_newbuild(copy_constructor_newbuild B)
    {
        this.name=B.name;
        this.roll= B.roll;
        this.sec=B.sec;
    }
    void display()
    {
        System.out.println(name+" "+roll+" "+sec);
    }
}

public class Copy_constructor {
    public static void main(String[] args) {
        copy_constructor_newbuild s1=new copy_constructor_newbuild("Papri",27,"A");
        copy_constructor_newbuild s2=new copy_constructor_newbuild(s1);
        s2.display();

    }
}
