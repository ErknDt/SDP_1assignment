package builder;

public class SportCarBuilder extends BaseCarBuilder {

    private static final String DEFAULT_ENGINE = "V8 4.0L";
    private static final int DEFAULT_SEATS = 2;
    private static final String DEFAULT_TRANSMISSION =
            "8-speed Automatic";

    public SportCarBuilder() {
        super(
                Car.Type.SPORTS,
                DEFAULT_ENGINE,
                DEFAULT_SEATS,
                DEFAULT_TRANSMISSION,
                true,
                false
        );
    }
}