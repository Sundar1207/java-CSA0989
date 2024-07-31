import java.util.*;
class box
{
    double w,h,d;

    box(double x,double y, double z)
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
class BoxOOPs
    {
        public static void main(String args[])
        {
              box obj=new box(10.5,20.5,5.5);
              obj.volume();
        }
}