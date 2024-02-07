package JavaSE.TestLambda;

public class MultiplyOperation {
    int getMultiplication(int a, int b){
        Operator operator = (s, s1) -> s * s1;

        return operator.toOperate(a,b);
    }
}
