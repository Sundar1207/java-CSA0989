class myself
{
    int num;
    myself(int n)
    {
      num=n;
    }
    void display()
    {
        if(num%2==0)
        {
        System.out.println("It is Even number : "+num);
        }
        else
        {
        System.out.println("It is Odd number : "+num);
        }

    }
}
class oddevenOOP
{
    public static void main(String arg[])
    {
        myself obj=new myself(23);
        obj.display();
    }
}