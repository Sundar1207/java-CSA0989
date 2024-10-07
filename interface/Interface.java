// -> defult method and private methods
// -> private methods can't access the implement class 
// -> interfase laa olla ststic methods laa can't call 
// -> only private static methods call the public static methods
// ->private method only access interfase 
// -> can't create obj for interface
// -> default + private or static + private static ( don't neet the obj , you <interface name >.<method name>).
// -> implements panna classkku obj create panni methods call do.

interface a 
{
    default void main(int a , int b)// default methods 
    {
        System.out.println("Sum of two numbers : "+(a+b));
        rule2();// --> calling private methods
    }
    private void rule2()
    {
        System.out.println("Hello java ");
    };
}
public class Interface implements a
{
    public static void main(String[] arg )
    {
        b obj=new b();
        obj.main(12,12);
    }
}
