package JavaSE.TestInterface;

public class Cat implements Animal{
    private String name;
    private int age;

    public Cat() {
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isKitten() {
        if (age < 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getSound() {
        return "Meow!";
    }
}
