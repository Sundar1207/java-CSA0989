//using area traingle of statick verible 
class sundar
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
class SUNdaraMoorthy
{
    public static void main(String args[])
    { 
      sundar.area(10,10);
    }
}