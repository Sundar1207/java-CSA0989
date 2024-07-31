import java.util.*;
class stringtest3
{
	public static void main(String arg[]) 
	{
		Scanner sc=new Scanner(System.in);
		String s1;
        System.out.print("Enter the string : ");
		s1=sc.nextLine();
		String s2;
		int i;
		s2=s1.substring(7);
		System.out.println(s2);
        i=s1.indexOf('j');
        System.out.println(i); 
        s2=s1.substring(3,5);
		System.out.println(s2);
        i=s1.indexOf('o');
        System.out.println(i);
        char s=s1.charAt(5);
		System.out.println(s);
		
	}
}