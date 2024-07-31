import java.util.*;
class box
{
    Scanner sc=new Scanner(System.in);
    double w,h,d;

    void get()
    {
        System.out.println("Enter the width : ");
        w=sc.nextDouble();
        System.out.println("Enter the hight : ");
        h=sc.nextDouble();
        System.out.println("Enter the Depth : ");
        d=sc.nextDouble();
    }
    void volume()
    {
        double vo=w*h*d;
        System.out.println("Volume of Box = "+vo);
    }
}
class BoxOOP1
    {
        public static void main(String args[])
        {
              box obj=new box();
              obj.get();
              obj.volume();
        }
}