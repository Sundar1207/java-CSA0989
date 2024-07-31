import java.util.*;
class box
{
    double w,h,d;

    void get(double x,double y, double z)
    {
           w=x;
           h=y;
           d=z;
    }
    void volume()
    {
        double vo=w*h*d;
        System.out.println("Volume of Box = "+vo);
    }
}
class BoxOOP2
    {
        public static void main(String args[])
        {
              box obj=new box();
              obj.get(10.5,20.5,5.5);
              obj.volume();
        }
}