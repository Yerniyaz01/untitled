package JavaSE.TestNasledie;

public class Mercedes extends Car {
    private String classType;

    public Mercedes() {
    }

    public Mercedes(String classType) {
        this.classType = classType;
    }

    public Mercedes(String name, String model, int maxSpeed, int year, double volume, String classType) {
        super(name, model, maxSpeed, year, volume);
        this.classType = classType;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public String ride(){
        return getName() + " Car " + getName() + " " + getModel() + " with max speed "
                + getMaxSpeed() + " km/h from " + getYear() + " year with engine volume "
                + getVolume() + " liters with " + classType + " class is riding.";
    }
}
