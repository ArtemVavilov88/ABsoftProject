package discriminant.absoft;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import static java.lang.Math.*;

public class QuadraticEquationTest {

    /**
     * Method verifies that quadratic equation has two different roots and these roots are calculated correctly
     */
    @Test
    public void discriminantIsGreaterThanZero(){
        //D = 49
        int a = 2;
        int b = 3;
        int c = -5;
        ArrayList squareRoots = QuadraticEquation.solveQuadraticEquation(a, b, c);
        Assert.assertTrue(squareRoots.size() == 2 && a * pow((Double) squareRoots.get(0),2) +
                b * (Double) squareRoots.get(0) + c == 0 && a * pow((Double) squareRoots.get(1),2) +
                b * (Double) squareRoots.get(1) + c == 0, "Something wrong with quadratic equation roots " +
                squareRoots);
    }

    /**
     * Method verifies that quadratic equation has two the same roots and these roots are calculated correctly
     */
    @Test
    public void discriminantIsEqualToZero(){
        //D = 0
        int a = 1;
        int b = -6;
        int c = 9;
        ArrayList squareRoots = QuadraticEquation.solveQuadraticEquation(a, b, c);
        Assert.assertTrue(squareRoots.size() == 2 && squareRoots.get(0) == (squareRoots.get(1))
                && a * pow((Double) squareRoots.get(0),2) + b * (Double) squareRoots.get(0) + c == 0,
                "Something wrong with quadratic equation roots " + squareRoots);
    }

    /**
     * Method verifies that quadratic equation has no roots as discriminant < 0
     */
    @Test
    public void discriminantIsLessThanZero(){
        //D = -131
        int a = 5;
        int b = 3;
        int c = 7;
        Assert.assertTrue(QuadraticEquation.solveQuadraticEquation(a, b, c) == null,
                "Function tried to calculate roots for equation where D < 0");
    }

    /**
     * Method verifies that an equation is linear as known parameter a = 0
     */
    @Test
    public void knownArgumentAIsZero(){
        //equation is linear
        int a = 0;
        int b = 3;
        int c = 7;
        Assert.assertTrue(QuadraticEquation.solveQuadraticEquation(a, b, c) == null,
                "Function tried to calculate roots for equation where a = 0");
    }
}
