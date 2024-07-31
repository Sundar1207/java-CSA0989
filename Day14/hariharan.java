class hari
{
    static double  w,h,a;
    public static void area(double x,double y)
    {
        w=x;
        h=y;
        a=w*h*1/2;
        System.out.println("Area of Traingle : "+a);
    }

}
class hariharan
{
    public static void main(String args[])
    { 
      hari.area(10,10);
    }
}