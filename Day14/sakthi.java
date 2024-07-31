class one
{
        double r;
        double area;
        
        double h;
        
        
        void area(double a)
        {
          r=a;
        }
        void ann(){
            area=(3.14*r*r);
        System.out.println("Area of circle is :"+area);
}
}
class two extends one
{
       double h;
       double you;
   	void areaa(double b)
   {
      h=b;
       
   }
void abb(){
   you=(3.14*r*r*h);
     
   
 System.out.println("Area of cylinder is :" +you);
}
}

class sakthi{
public static void main(String args[]){

  two obj=new two();
  obj.area(5.3);
  obj.ann();
  obj.areaa(2.1);
  obj.abb();
}}