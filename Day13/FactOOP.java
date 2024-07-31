class fact 
{
    int num,i,fact=1;
    fact(int n)
    {
        num=n;
    }
    void display()
    {
        if(num==0||num==1)
        {
            System.out.println(" 1 ");
        }
        else
        {
           for(i=2;i<=num;i++)
           {
            fact*=i;
           }
           System.out.println(fact+" ");
        }
    }
}
class FactOOP
{
    public static void main(String arg[])
    {
        fact obj=new fact(1);
        obj.display();
    }
}