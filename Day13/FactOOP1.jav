class Copy
{
    int a,b;
    Copy(int a1,int b1)
    {
        a=a1;
        b=b1;
    }
    copy(copy c )
    {
        a=c.a;
        b=c.b;

    }
    void view()
    {
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }

}
class copytest
{
    public static void main(String arg[])
    {
       Copy c=new Copy(5,10);
       System.out.println(" oricnal  ");
       c.view();
       Copy c2=new Copy(c);
       System.out.println(" copy  ");
       c2.viwe();
    }
}