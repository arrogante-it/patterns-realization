package sinko.patterns.singltonDONE;

public interface Planet {
    // статик можно не указывать,
    // так как переменные в интерфейсе по умолчанию статичны,
    // однако для примера я явно указал static
    static String SUN = "sun";
    static String MOON = "moon";
    static String EARTH = "earth";
}
