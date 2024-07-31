import java.util.*;
class prime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();
        int flack=0;
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                flack=1;
            }
        }
        if(flack==0)
        {
            System.out.println("It is prime number ");
        }
        else 
        {
             System.out.println("It is not prime number ");
        }
    }
}