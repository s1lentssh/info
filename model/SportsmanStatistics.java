package task1.model;

import java.util.List;

public class SportsmanStatistics {

    private final List<Integer> marks;

    public SportsmanStatistics(List<Integer> marks) {
        this.marks = marks;
    }

    public int getTotal() {
       return marks.stream().mapToInt(i -> i).sum();
    }

    @Override
    public String toString() {
        return "SportsmanStatistics{" + "marks=" + marks + "}";
    }
}
