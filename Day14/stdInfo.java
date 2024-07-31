import java.util.*;
class info 
{
    Scanner sc=new Scanner(System.in);
    int mark[]=new int[4];
    int avg=0;
    int sum=0,i;

    info()
    {
        for(i=0;i<4;i++)
        {
            System.out.println("Enter the mark : "+(i+1));
            mark[i]=sc.nextInt();
            sum+=mark[i];
        }
        avg=sum/4;
        System.out.println("therefore the average of the student is  : "+avg);
    }
    void  display()
    {

        if(avg>=90)
        {
            System.out.println("Grade is A ");
        }
        else if(avg<90&&avg>=80)
        {
            System.out.println("Grade is B ");
        }
        else if(avg<80&&avg>=70)
        {
            System.out.println("Grade is C ");
        }
        else if(avg<70&&avg>=60)
        {
            System.out.println("Grade is D ");
        }
        else if(avg<60&&avg>=50)
        {
            System.out.println("GRade is E ");
        }
        else
        {
            System.out.println("--->>> You are Failed ...");
        }
    }
}
class stdInfo
{
    public static void main(String args[])
    {
        info obj=new info();
        obj.display();
    }
}