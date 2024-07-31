import java.util.*;
class count_vowelConsonant
{
	public static void main(String arg[]) 
	{
		Scanner sc=new Scanner(System.in);
        char rev;
		int vow=0,cos=0,i;
        System.out.print("Enter the Character : ");
        String s1;
        s1=sc.nextLine();
        int n;
		n=s1.length();
		for( i=0;i<n-1;i++)
		{
           
		   rev=s1.charAt(i);
		   if(rev=='a'||rev=='e'||rev=='i'||rev=='o'||rev=='u')
		   {
              vow++;
		   }
		   else
		   {
              cos++;
		   }

           System.out.println("number of vowels  : "+vow);
		   System.out.println("number of consonant  : "+cos);

		}
	}
} 