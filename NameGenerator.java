package task1;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class NameGenerator {

    private final static List<String> SURNAMES = Arrays.asList(
            "Smirnov",
            "Ivanov",
            "Kuznetsov",
            "Popov",
            "Sokolov",
            "Lebedev",
            "Kozlov",
            "Novikov",
            "Morozov"
    );

    private final static List<String> NAMES = Arrays.asList(
            "Karp",
            "Kazimir",
            "Khariton",
            "Kiril",
            "Klavdii",
            "Kliment",
            "Kondrati",
            "Konstantin",
            "Kostya",
            "Kozmin"
    );

    private static final Random random = new Random();

    public static String getRandomSurname() {
        return SURNAMES.get(random.nextInt(SURNAMES.size() - 1));
    }

    public static String getRandomName() {
        return NAMES.get(random.nextInt(SURNAMES.size() - 1));
    }
}
