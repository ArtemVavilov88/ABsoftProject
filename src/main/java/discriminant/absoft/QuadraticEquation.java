package discriminant.absoft;

import java.util.ArrayList;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;


public class QuadraticEquation {
    public static ArrayList solveQuadraticEquation(int a, int b, int c) {
        double discriminant = pow(b, 2) - 4 * a * c;
        if (discriminant >= 0 && a != 0) {
            double x1, x2;
            x1 = (-b + sqrt(discriminant))/(2 * a);
            x2 = (-b - sqrt(discriminant))/(2 * a);
            ArrayList<Double> actualSquareRoots = new ArrayList<>();
            actualSquareRoots.add(x1);
            actualSquareRoots.add(x2);
            System.out.println("Square roots X1 and X2 = " + actualSquareRoots);
            return actualSquareRoots;
            }
        else if (a == 0) {
            System.out.println("a = 0, this equation is linear");
            return null;
        } else {
            System.out.println("Discriminant less then 0");
            return null;
        }
    }
}