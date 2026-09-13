package builder;

public class Main {

    public static void main(String[] args) {

        Director director = new Director();

        Car sportsCar = director.buildPremiumCar(
                new SportCarBuilder()
        );

        Car familyCar = director.buildBasicCar(
                new FamilyCarBuilder()
        );

        System.out.println("Sport car:");
        System.out.println(sportsCar);

        System.out.println();

        System.out.println("Family car:");
        System.out.println(familyCar);

        System.out.println();

        Car customSportsCar = new SportCarBuilder()
                .setEngine("V6 3.0L Twin Turbo")
                .setSeats(2)
                .setTransmission("7-speed Automatic")
                .setGPS(true)
                .setSunroof(false)
                .build();

        System.out.println("Custom sports car:");
        System.out.println(customSportsCar);
    }
}