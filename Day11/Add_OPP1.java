import java.util.*;
class Add_OPP1 {
    class Add{
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        void get(){
            System.out.println("Enter two numbers: ");
            a = sc.nextInt();
            b = sc.nextInt();
            sc.close();
        }
        void cal(){
            c = a + b;

        }
        void display() {
            System.out.println("The sum is: " + c);
        }
    }

    public static void main () {
        Add_OPP1 obj = new Add_OPP1();
        Add obj1 = new Add();
        get();
        cal();
        display();
    }
}