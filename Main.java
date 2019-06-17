package task1;

import task1.model.Sportsman;
import task1.model.SportsmanStatistics;
import task1.model.factory.SportsmanFactory;
import task1.model.factory.SportsmanStatisticsFactory;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Map<Sportsman, SportsmanStatistics> map = new HashMap<>();
        for (int i = 0; i < 22; i++) {
            map.put(SportsmanFactory.create(), SportsmanStatisticsFactory.create());
        }

        int maxPoints = map
                .entrySet()
                .stream()
                .max(Comparator.comparingInt(lhs -> lhs.getValue().getTotal()))
                .get()
                .getValue()
                .getTotal();

        List<Sportsman> winnerList = map
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue().getTotal() == maxPoints)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        map.forEach((sportsman, sportsmanStatistics) -> {
            System.out.println(sportsman + ": " + sportsmanStatistics);
        });

        winnerList.forEach(System.out::println);
    }
}
