package JavaSE.TestAbstract;

import static java.lang.Math.PI;

public class SphereGold extends GoldShape {
    private double radius;

    public SphereGold() {
    }

    public SphereGold(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        double V;
        V = (4.0 / 3.0) * (PI * (radius * radius * radius));
        return V;
    }

}
