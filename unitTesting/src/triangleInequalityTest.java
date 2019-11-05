import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class triangleInequalityTest {
    @Test
    public void rightTriangle() {
        assertTrue(triangleInequality.getValues(3, 4, 5));
    }

    @Test
    public void isoscelesTriangle() {

        assertTrue(triangleInequality.getValues(4, 4, 2));
    }

    @Test
    public void equilaterallTriangle() {

        assertTrue(triangleInequality.getValues(6.5, 6.5, 6.5));
    }

    @Test
    public void sumOfTwoSidesEqualsThird() {
        assertFalse(triangleInequality.getValues(15.5, 15.5, 31.0));
    }

    @Test
    public void sumOfTwoSidesLessThird() {
        assertFalse(triangleInequality.getValues(10.3, 9.5, 22.9));
    }

    @Test
    public void sumOfTwoSidesGreaterThird() {
        assertFalse(triangleInequality.getValues(10.2, 80.8, 20.5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void allSidesAreZero() {
        triangleInequality.getValues(0.0, 0.0, 0.0);
    }
    @Test
    public void allSidesAreMaxDouble() {
        assertTrue(triangleInequality.getValues(Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE));
    }
    @Test(expected = IllegalArgumentException.class)
    public void oneSideIsNegative() {
        triangleInequality.getValues(15.0, -22.1, 30.0);
    }
    @Test(expected = IllegalArgumentException.class)
    public void oneSideIsZero() {
        triangleInequality.getValues(0, 22.0, 44.0);
    }

}
