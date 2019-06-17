package task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MarksGenerator {
    public static List<Integer> generate(int count) {
        List<Integer> marks = new ArrayList<>();
        Random random = new Random();

        for(int i = 0; i < count; i++) {
            marks.add(random.nextInt(5) + 1);
        }

        return marks;
    }
}
