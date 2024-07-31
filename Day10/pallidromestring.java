import java.util.*;
class pallidromestring
{
	public static void main(String arg[]) 
	{
		Scanner sc=new Scanner(System.in);
		String s1,s2="";
        System.out.print("Enter the string : ");
		s1=sc.nextLine();
		int i,n;
		char rev;
        n=s1.length();

		for(i=n-1;i>=0;i--)
		{
			rev=s1.charAt(i);
            s2=s2+rev;
		}
        
	if(s1.equals(s2))
	{
	System.out.println("It is pallidrome");
	}
	else
	{
	System.out.println("not a pallidrome ");
	}
	}
} 