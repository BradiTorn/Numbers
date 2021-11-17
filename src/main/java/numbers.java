import java.util.ArrayList;
import java.util.List;

public class numbers {
    public double[] Sum (double a, double b, double c){
        double [] ur = new double[2];
        double x1;
        double x2;

        double discr = Math.pow(b, 2) - (4 * a * c);
        if (discr > 0)
        {
            x1 = (-b + Math.sqrt(discr)) / 2 * a;
            x2 = (-b - Math.sqrt(discr)) / 2 * a;

            ur[0] = x1;
            ur[1] = x2;
        }

        if (discr == 0)
        {
            x1 = -b / 2 * a;
            ur[0] = x1;
            ur[1] = 0;
        }

        if (discr < 0)
        {
            ur[0] = 0;
            ur[1] = 0;
        }

        return ur;
    }
}
