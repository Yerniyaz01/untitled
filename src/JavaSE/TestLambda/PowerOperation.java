package JavaSE.TestLambda;

public class PowerOperation {
    int getPower (int a, int b) {
        Operator operator = (s,s1) -> (int) Math.pow(s,s1);

        return operator.toOperate(a,b);
    }

}
