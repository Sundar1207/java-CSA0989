class sundar
{
    int num ,div;
    sundar()
    {
        num=10;
        div=5;
    }
    void display()
    {
       System.out.println("Remaider : "+num%div);
       System.out.println("Cosition : "+num/div);
    }

}
class sundaramoorthySTest228
{
    public static void main (String arg[])
    {
        sundar s=new sundar();
        s.display();
    }

}