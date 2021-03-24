package modernjavainaction.chap19.sjm;

import java.util.function.DoubleUnaryOperator;

/**
 * @author sjm5858@126.com
 * @date 2021/2/23 22:12
 */
public class Currying {

    public static void main(String[] args) {
        DoubleUnaryOperator sjmConvert = curriedConverter(2, 3);
        DoubleUnaryOperator tmpConvert = curriedConverter(2, 0);
        System.out.println(sjmConvert.applyAsDouble(3));
        System.out.println(tmpConvert.applyAsDouble(3));

    }

    private static DoubleUnaryOperator curriedConverter(double y, double z) {
        return (double operand) -> operand * y + z;
    }
}
