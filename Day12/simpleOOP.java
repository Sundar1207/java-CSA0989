import java.util.*;
class simple
{

    double t,p,i;


    simple()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the principle");
      p=sc.nextDouble();
      System.out.println("Enter the intrest ");
      i=sc.nextDouble();
      System.out.println("Enter the time");
      t=sc.nextDouble();
    }
    void dis()
    {
        double simple=(i*t*p)/100;
        System.out.println("Simple intrest = "+ simple);
    }
}
class simpleOOP
{
    public static void main(String args[])
    {
        simple obj=new simple();
        obj.dis();

    }
}