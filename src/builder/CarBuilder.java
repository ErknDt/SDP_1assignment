package builder;

public interface CarBuilder {

    CarBuilder setEngine(String engine);

    CarBuilder setSeats(int seats);

    CarBuilder setTransmission(String transmission);

    CarBuilder setGPS(boolean gps);

    CarBuilder setSunroof(boolean sunroof);

    Car build();
}