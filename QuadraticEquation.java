import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner s = new Scanner(System.in);
            System.out.println("Enter value of a : ");
             a= s.nextInt();
            System.out.println("Enter value of b : ");
            b= s.nextInt();
            System.out.println("Enter value of c : ");
             c= s.nextInt();
             int d=(b*b-4*a*c);

            if (d > 0.0)
            {
            double x1 = (-b + Math.pow(d, 0.5)) / 2 * a;
            double x2 = (b - Math.pow(d, 0.5)) / 2 * a;
            System.out.println("roots are real and different    x1:-" + x1 + "   x2:-" + x2);
        }
            else if(d == 0.0)
            {

            double x1 = -b / 2 * a;
            double x2 = -b / 2 * a;
            System.out.println("roots are real and same    x1=x2:-" + x2);
        }

        else if (d < 0.0)
        {
            double x1 = -b / 2 * a + (Math.pow(d, 0.5)) / (2 * a);
            double x2 = b / 2 * a - (Math.pow(d, 0.5)) / (2 * a);
            System.out.println("roots are complex and different    x1:-"+x1+"i"+"        x2:-"+x2);

        }
    }
}
