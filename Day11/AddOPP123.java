import java.util.*;
class Add
{
    Scanner sc=new Scanner(System.in)
    int a,b,c;
    
    void get()
    {
       System.out.println("Enter the valuve : ");
       a=sc.nextInt();
       System.out.println("Enter the valuve : ");
       b=sc.nextInt();       
    }
    void sum()
    {
        c=a+b;
    }
    void dis()
    {
        System.out.println("Sum of two numbers = "+c);
    }

}
class AddOOP123
{
    public static void main (String arg[])
    {
        
        Add obj=new Add();
        obj.get();
        obj.sum();
        obj.dis();
    }
}