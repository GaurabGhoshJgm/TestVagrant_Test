public abstract class SolarSystem {
    // TODO
}

public class Planet extends SolarSystem {

    private final String name;
    private final double x;
    private final double y;

    public Planet(String name, double x, double y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Planet p) {
        return Math.sqrt((p.x - this.x) * (p.x - this.x) + (p.y - this.y) * (p.y - this.y));
    }

}

public class Main {

    public static void main(String[] args) {
        Planet earth = new Planet("Earth", 5.2, 8.3);
        Planet mars = new Planet("Mars", 4.3, 2.7);

        System.out.println(mars.distanceTo(earth));
    }
}