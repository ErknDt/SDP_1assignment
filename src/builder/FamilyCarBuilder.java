package builder;

public class FamilyCarBuilder extends BaseCarBuilder {

    private static final String DEFAULT_ENGINE = "2.5L Hybrid";
    private static final int DEFAULT_SEATS = 7;
    private static final String DEFAULT_TRANSMISSION = "CVT";

    public FamilyCarBuilder() {
        super(
                Car.Type.FAMILY,
                DEFAULT_ENGINE,
                DEFAULT_SEATS,
                DEFAULT_TRANSMISSION,
                true,
                true
        );
    }
}