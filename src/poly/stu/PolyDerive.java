package poly.stu;

import java.util.ArrayList;

/**
 * This class can compute the derivative of a polynomial.
 *
 *
 * @author king-ob
 */
public class PolyDerive {

    /**
     * Unused constructor, made private to avoid javadoc generation.
     */
    private PolyDerive() {
    }

    /**
     * Computes the derivative for a polynomial.  For example:
     * <pre>
     * poly=[1]: [0]
     * poly=[3, -1]: [-1]
     * poly=[0, 3]: [3]
     * poly=[2, -1, -2, 1]: [-1, -4, 3]
     * poly=[-5, 0, 0, 3, 3, 1]: [0, 0, 9, 12, 5] 
     * </pre>
     * 
     * @param poly A list representing the polynomial, in reverse order.
     * @rit.pre poly is not an empty list.  Minimally it will contain
     *      a constant term.
     * @return A polynomial as a list in reverse order.
     */
    public static ArrayList<Integer> computeDerivative(ArrayList<Integer> poly) {
        ArrayList<Integer> deriv = new ArrayList<>();
        int current;




        // TODO
        for (int i = 1; i <poly.size(); i++) {


                current = i * poly.get(i);

                deriv.add((int) current);
            }


        return deriv;
    }
}
