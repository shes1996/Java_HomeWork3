import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

//(Дополнительное) Реализовать алгоритм сортировки слиянием
//
//1. Пусть дан произвольный список целых чисел, удалить из него чётные числа
//
//2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.
public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0){
                list.remove(i);
            }
        }
        System.out.println(list);

        ArrayList<Integer> list1 = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        System.out.println(list1);
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) % 2 == 0){
                list1.remove(i);
            }
        }
        System.out.println(list1);


    }
}
