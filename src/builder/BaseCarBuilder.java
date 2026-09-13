package builder;

public abstract class BaseCarBuilder implements CarBuilder {

    private static final int MIN_SEATS = 1;
    private static final int MAX_SEATS = 8;

    protected final Car.Type type;

    protected String engine;
    protected int seats;
    protected String transmission;
    protected boolean gps;
    protected boolean sunroof;

    protected BaseCarBuilder(
            Car.Type type,
            String defaultEngine,
            int defaultSeats,
            String defaultTransmission,
            boolean defaultGPS,
            boolean defaultSunroof
    ) {
        this.type = type;
        this.engine = defaultEngine;
        this.seats = defaultSeats;
        this.transmission = defaultTransmission;
        this.gps = defaultGPS;
        this.sunroof = defaultSunroof;
    }

    @Override
    public CarBuilder setEngine(String engine) {
        if (engine == null || engine.isBlank()) {
            throw new IllegalArgumentException(
                    "Engine cannot be empty"
            );
        }

        this.engine = engine;
        return this;
    }

    @Override
    public CarBuilder setSeats(int seats) {
        if (seats < MIN_SEATS || seats > MAX_SEATS) {
            throw new IllegalArgumentException(
                    "Seats must be between "
                            + MIN_SEATS
                            + " and "
                            + MAX_SEATS
            );
        }

        this.seats = seats;
        return this;
    }

    @Override
    public CarBuilder setTransmission(String transmission) {
        if (transmission == null || transmission.isBlank()) {
            throw new IllegalArgumentException(
                    "Transmission cannot be empty"
            );
        }

        this.transmission = transmission;
        return this;
    }

    @Override
    public CarBuilder setGPS(boolean gps) {
        this.gps = gps;
        return this;
    }

    @Override
    public CarBuilder setSunroof(boolean sunroof) {
        this.sunroof = sunroof;
        return this;
    }

    @Override
    public Car build() {
        validate();

        return new Car(
                type,
                engine,
                seats,
                transmission,
                gps,
                sunroof
        );
    }

    private void validate() {
        if (engine == null || engine.isBlank()) {
            throw new IllegalStateException(
                    "Car must have an engine"
            );
        }

        if (transmission == null || transmission.isBlank()) {
            throw new IllegalStateException(
                    "Car must have a transmission"
            );
        }

        if (seats < MIN_SEATS || seats > MAX_SEATS) {
            throw new IllegalStateException(
                    "Invalid number of seats"
            );
        }
    }
}