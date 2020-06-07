package poly.stu;

import java.util.ArrayList;

/**
 * This class can evaluate a polynomial, and determine whether the polynomial
 * is zero or not.
 *
 *
 * @author king-0b
 */
public class PolyEval {

    /**
     * Unused constructor, made private to avoid javadoc generation.
     */
    private PolyEval() {
    }

    /**
     * Evaluates a polynomial for a supplied value for x.  For example:
     * <pre>
     * poly=[1], x=0: 1.0
     * poly=[3, -1], x=4.5: -1.5
     * poly=[0, 3], x=-2: -6.0
     * poly=[2, -1, -2, 1], x=2: 0.0
     * poly=[-5, 0, 0, 3, 3, 1], x=-3.9: -391.16669
     * </pre>
     *
     * @param poly A list representing the polynomial, in reverse order.
     * @param x The value for x.
     * @rit.pre poly is not an empty list.  Minimally it will contain
     *  a constant term.
     * @return The result of the evaluation.
     */
    public static double evaluate(ArrayList<Integer> poly, double x) {
        double result = 0.0;
        if(poly.size() == 1){
            result = poly.indexOf(1) * x;
        }
        else{
            for (int i = 0; i < poly.size() ; i++) {
                double currentValue =poly.get(i) * Math.pow(x,i);
                result =+ currentValue;
                
            }
        }



        
        return result;
    }
    
    /**
     * Tells whether a polynomial is zero or not.  For example:
     * <pre>
     * poly=[0]: True
     * poly=[1]: False
     * poly=[0, 3]: False
     * poly=[0,0,0,4]: False
     * </pre>
     * 
     * @param poly A list representing the polynomial, in reverse order.
     * @rit.pre poly is not an empty list.  Minimally it will contain
     *  a constant term.
     * @return True if it is zero, False otherwise.
     */
    public static boolean isZero(ArrayList<Integer> poly) {

        if(poly.size() == 0){
            return true;
        }

        return false;
    }
}
