interface a 
{
    default void main(int a , int b)
    {
        System.out.println("Sum of two numbers : "+(a+b));
        rule2();
    }
    private void rule2()
    {
        System.out.println("Hello java ");
    };
}
class c implements a
{
    
}
public class b 
{
    public static void main(String[] arg )
    {
        a obj=new c();
        obj.main(12,12);
    }
}
