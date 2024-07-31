class mulitiplTaple
{
    int n,m;

mulitiplTaple(int x,int y)
{
    m=x;
    n=y;
}
void display()
{
    for(int i=1;i<=n;i++)
    {
        System.out.println(i+" x "+m+" = "+i*m);
    }
}

}
class mulitipleTapleOOp
{
    public static void main(String arg[])
    {
        mulitiplTaple obj=new mulitiplTaple(5,10);
        obj.display();
    }
}