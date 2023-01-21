public class EuclideanDistance
{
    public static void main(String[] args)
    {
        double x1=0, y1=0 , x2, y2;
        Double ED;

        x2 = Double.parseDouble(args[0]);
        y2 = Double.parseDouble(args[1]);

        System.out.println("x1:-0");
        System.out.println("y1:-0");
        System.out.println("x2:-" + args[0]);
        System.out.println("y2:-" + args[1]);

        ED = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Distance between point(0,0) and point(x,y) is:-" + ED);
    }

}
