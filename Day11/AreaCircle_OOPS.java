import java.util.*;
public class AreaCircle_OOPS {
   class Area {
    double pi = 3.14;
    double radius;
    double area;
    public void getRad(double x)
    { 
        radius=x;
    }
    public void getArea() {
    area = pi * radius * radius;
    }
    }

    public static void main(String[] args)
    {    
    AreaCircle_OOPS obj = new AreaCircle_OOPS();
    Area obj1 = obj.new Area();
    obj1.getRad(23);
    obj1.getArea();
    System.out.println("The area of the circle is: " + obj1.area);
    }    
}