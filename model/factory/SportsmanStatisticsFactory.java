package task1.model.factory;

import task1.MarksGenerator;
import task1.model.SportsmanStatistics;

public class SportsmanStatisticsFactory {
    public static SportsmanStatistics create() {
        return new SportsmanStatistics(MarksGenerator.generate(5));
    }
}
