
// Implement the function findRoots to find the roots of the quadratic equation: ax2 + bx + c = 0.
// If the equation has only one solution, the function should return that solution as both elements of the Roots.
// The equation will always have at least one solution.

public class QuadraticEquation {
    public static Roots findRoots(double a, double b, double c) {
        throw new UnsupportedOperationException("Waiting to be implemented.");
    }

    public static void main(String[] args) {
        Roots roots = QuadraticEquation.findRoots(2, 10, 8);
        System.out.println("Roots: " + roots.x1 + ", " + roots.x2);
    }
}

class Roots {
    public final double x1, x2;

    public Roots(double x1, double x2) {
        this.x1 = x1;
        this.x2 = x2;
    }
}
