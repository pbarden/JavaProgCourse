/*
 * No license. Written for
 * PRG420 at University of Phoenix
 */
package calcengine;

/**
 *
 * @author paulb
 */
public class Divisor extends CalculateBase {
    public Divisor() {}
    public Divisor(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        double value = getLeftVal() / getRightVal();
        setResult(value);
    }
}
