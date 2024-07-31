class myself
{
    String name;
    int regno;
    double gcp;
    myself()
    {
        name="S.sundaramoorthy";
        regno=192324228;
        gcp=9.3;
    }
    void display()
    {
        System.out.println("Name is :"+name);
        System.out.println("Reg No : "+regno);
        System.out.println("CGP :"+gcp);
    }
}
class MyselfOOP
{
    public static void main(String arg[])
    {
        myself obj=new myself();
        obj.display();
    }
}