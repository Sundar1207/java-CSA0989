import java.util.*;
class leftstar
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();

        for(int i=1;i<=num;i++)
        {

            for(int s=num;s>=1;s--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        } 
    }
}