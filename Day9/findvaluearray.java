import java.util.*;
class findvaluearray
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println(" array size is 5 ");
    int arr[]=new int[10];
    int i,f=0,ss=0;

    for( i=1;i<=5;i++)
    {
    arr[i]=sc.nextInt();
    } 

    //value in put 
    System.out.println("Enter the yours value ");
    int value=sc.nextInt();

    for( i=1;i<=5;i++)
    {
    if(arr[i]==value);
    {
     f=arr[i];
     System.out.print("possition is ="+i);
    }

    if(f==value)
    {
    System.out.println("not there this value ");
    }
    }
}
