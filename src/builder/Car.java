package builder;

public final class Car {

    public enum Type {
        SPORTS,
        FAMILY
    }

    private final Type type;
    private final String engine;
    private final int seats;
    private final String transmission;
    private final boolean gps;
    private final boolean sunroof;

    Car(
            Type type,
            String engine,
            int seats,
            String transmission,
            boolean gps,
            boolean sunroof
    ) {
        this.type = type;
        this.engine = engine;
        this.seats = seats;
        this.transmission = transmission;
        this.gps = gps;
        this.sunroof = sunroof;
    }

    public Type getType() {
        return type;
    }

    public String getEngine() {
        return engine;
    }

    public int getSeats() {
        return seats;
    }

    public String getTransmission() {
        return transmission;
    }

    public boolean hasGps() {
        return gps;
    }

    public boolean hasSunroof() {
        return sunroof;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type=" + type +
                ", engine='" + engine + '\'' +
                ", seats=" + seats +
                ", transmission='" + transmission + '\'' +
                ", gps=" + gps +
                ", sunroof=" + sunroof +
                '}';
    }
}