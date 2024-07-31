class sundaramoorthyS
{
    int num,sum=0;
    sundaramoorthyS(int n)
    {
        num=n;
    }
    void display()
    {
        for(int i=1;i<=num;i++)
        {
            sum+=i;
        }
        System.out.println("Sum of series : "+sum);
    }
}
class sundaramoorthySTest
{
    public static void main(String args[])
    {
         sundaramoorthyS s=new sundaramoorthyS(5);
         s.display();

    }
}