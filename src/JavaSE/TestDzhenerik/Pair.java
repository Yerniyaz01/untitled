package JavaSE.TestDzhenerik;

public class Pair <A, B> {
    private A first;
    private B second;

    public Pair() {
    }

    public Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public A getFirst() {
        return first;
    }

    public void setA(A first) {
        this.first = first;
    }

    public B getSecond() {
        return second;
    }

    public void setB(B second) {
        this.second = second;
    }

}
