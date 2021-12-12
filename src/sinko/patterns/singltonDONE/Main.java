package sinko.patterns.singltonDONE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        //readStringKeyFromConsoleAndInitPlanet();
    }

    public static Planet thePlanet;

    static {
           readStringKeyFromConsoleAndInitPlanet();
    }

    public static void readStringKeyFromConsoleAndInitPlanet() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string;

        try {
            string = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        if (string.equals(Planet.EARTH)) {
            thePlanet = Earth.getInstance();
            System.out.println("created: " + thePlanet.getClass().getName());

        } else if (string.equals(Planet.MOON)) {
            thePlanet = Moon.getInstance();
            System.out.println("created: " + thePlanet.getClass().getName());

        } else if (string.equals(Planet.SUN)) {
            thePlanet = Sun.getInstance();
            System.out.println("created: " + thePlanet.getClass().getName());

        } else {
            thePlanet = null;
            System.out.println("object not created");
        }
    }
}
