class table 
{

    int i,n,m;
    table()
    {
        n=5;
        for(i=1;i<=10;i++)
        {
            System.out.println(i+" X "+n+" = "+(n*i));
        }
    }
    table(int m)
    {
        n=m;
        for(i=1;i<=10;i++)
        {
            System.out.println(i+" X "+n+" = "+(n*i));
        }
    }
    table(int s,int x)
    {
        m=s;
        n=x;
        for(i=1;i<=m;i++)
        {
            System.out.println(i+" X "+n+" = "+(n*i));
        }
    }
}
class multableOOPs
{
    public static void main(String args[])
    {
        
        table obj1=new table();
        System.out.println("-------------------");
        table obj2=new table(3);
        System.out.println("-------------------");
        table obj3=new table(10,7);
    
    }
}