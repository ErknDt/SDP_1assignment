package builder;

public class Director {

    public Car buildBasicCar(CarBuilder builder) {
        return builder
                .setGPS(false)
                .setSunroof(false)
                .build();
    }

    public Car buildPremiumCar(CarBuilder builder) {
        return builder
                .setGPS(true)
                .setSunroof(true)
                .build();
    }
}