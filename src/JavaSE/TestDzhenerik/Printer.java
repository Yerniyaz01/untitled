package JavaSE.TestDzhenerik;

public class Printer<T> {
    private T t;

    public Printer() {
    }

    public Printer(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public void setValue(T value) {
        this.t = value;
    }

    public T getValue() {
        return t;
    }

    public void printValue() {
        System.out.println("Value is" + getValue());
    }

    public void refresh() {
        this.t = null;
    }
}
