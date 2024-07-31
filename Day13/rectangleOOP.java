class rectangle
{
    double length,breath;
     double area;
    rectangle(double x,double y)
    {
       length=x;
       breath=y;

    }

    rectangle(rectangle c )
    {
       length=c.length;
       breath=c.breath;

    }
    
    void view()
    {
        area =length*breath;
        System.out.println("rectangle area = "+ area);
    }

}
class rectangleOOP
{
    public static void main(String arg[])
    {
       rectangle c=new rectangle(5,10);
       System.out.println(" oricnal  ");
       c.view();
       rectangle c2=new rectangle(c);
       System.out.println(" copy  ");
       c2.view();
    }
}