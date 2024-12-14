import java.util.*;
class a{
    public void pl(){
        System.out.println("hello students");
    }
}
class b extends a{
    public void r(){
        System.out.println("hello teachers");
    }
}
public class Singleinheritance{
    public static void main(String args[]){
        a h=new a();
        b j=new b();
        h.pl();
        j.pl();
        j.r();
    }
}