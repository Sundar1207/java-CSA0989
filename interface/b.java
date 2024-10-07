interface a 
{
    public static void main(int a , int b) // static method 
    {
        System.out.println("Sum of two numbers : "+(a+b));
        rule2();
    }
    public void rule();
    // you can not to access to private methods 
    //now i am using private static method so you access the that class puvlic staticla call panum
    
    private static void rule2()// private static method  
    {
        System.out.println("Hello java ");
    };
}
public class b
{
    public static void main(String[] arg )
    {
      
        a.main(12,12);  // you call access to <iterface name >. method name ---> a is interface name and main is ststic methods 
    }
}
