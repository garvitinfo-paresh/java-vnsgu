interface test
{
    void func();
}
class test2 {
   void func2()
   {
     System.out.println("hellloo aayush");
   };
}
class test1  extends test2 implements test{
    public void func()
    {
        System.out.println("hiii");
    }
    void func1()
    {
        System.out.println("helloooo");
    }
    // public void func2()
    // {
    //     System.out.println("hiiii vidhya how r you");
    // }
}
public class demo {
    public static void main(String args[])
    {
        test1 t1 = new test1();
        t1.func();
        t1.func1();
        t1.func2();
    }
}
