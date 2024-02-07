package JavaSE.TestLambda;

public class SumOperation {
    public int getSum(int a, int b) {
        Operator operator = (s, s1) -> s + s1;

        return operator.toOperate(a, b);
    }
}
