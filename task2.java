import java.util.ArrayList;
import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        int average = 0;
        int max = 0;
        int min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            average += list.get(i);
            if (list.get(i) > max) max = list.get(i);
            if (list.get(i) < min) min = list.get(i);
        }
        System.out.printf("Average: %d", average/2);
        System.out.println();
        System.out.printf("Minimum: %d", min);
        System.out.println();
        System.out.printf("Maximum: %d", max);
    }

}
