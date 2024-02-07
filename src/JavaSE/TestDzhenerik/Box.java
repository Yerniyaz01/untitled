package JavaSE.TestDzhenerik;

import java.util.ArrayList;
import java.util.List;

public class Box <T>{
    private List<T> contents = new ArrayList<>();

    public Box() {
    }

    public Box(List<T> contents) {
        this.contents = contents;
    }

    public List<T> getContents() {
        return contents;
    }

    public void setContents(List<T> contents) {
        this.contents = contents;
    }

    public void add(T item) {
        contents.add(item);
    }

}
