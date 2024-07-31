import java.util.*;
class mnimumarray
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println(" array size is 5 ");
    int arr[]=new int[5];
    int i,min=0;

    for( i=0;i<5;i++)
    {
    arr[i]=sc.nextInt();
    } 
    min=arr[0];
    for( i=1;i<5;i++)
    {
        if(arr[i]<min)
        {
            min=arr[i];
        }
    }
    System.out.print("manimumarray array = "+min);

    }
}