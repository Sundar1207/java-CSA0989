// it is return type labda expresstion
@FunctinalInterface 
interface a 
{
    static void main(int a , int b)
    {
        System.out.println("Sum of two numbers : "+(a+b));
        rule2();
    }
    private static void rule2()
    {
        System.out.println("Hello java ");
    };
    
    
    public int rule(int a,int b);
}
public class Functionalinterface_2
{
    public static void main(String[] arg )
    {
        a.main(12,12);
        
        a o = (a,b)-> a+b;
       System.out.println( o.rule(24,24));
    }
}
