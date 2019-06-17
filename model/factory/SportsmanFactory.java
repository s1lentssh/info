package task1.model.factory;

import task1.NameGenerator;
import task1.model.Sportsman;

public class SportsmanFactory {
    public static Sportsman create() {
        return new Sportsman(NameGenerator.getRandomName(), NameGenerator.getRandomSurname());
    }
}
