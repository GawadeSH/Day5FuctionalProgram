public class WindChill
{
    public static void main(String[] args)
    {
        double T;
        double S;
        Double chill;
        T=Double.parseDouble(args[0]);
        S=Double.parseDouble(args[1]);
        double m=(35.74+0.6215*T+(0.4275*T-35.75)*Math.pow(S,0.16));

        System.out.println("the wind chill is:-"+m);




    }
}
