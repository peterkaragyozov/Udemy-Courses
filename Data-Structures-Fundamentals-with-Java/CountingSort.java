import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CountingSort {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(4, 1, 32, 15, 96, 42, 7, 15));

        int[] counts = new int[101]; //имаме числа, които са само от 0 до 100. Все едно са оценките в проценти на студенти

        for (int number : numbers) {
            counts[number]++;
        }

        for (int number = 0; number <= 100; number++) {
            int count = counts[number];
            for (int i = 0; i < count; i++) {
                System.out.print(number + " ");
            }
        }
        // За горното времето е O(n), жертваме повече памет(пространство) обаче. Горното се нарича Counting Sort,
        // което е вид Bucket Sort. Работи за линейно време, но жертва памет

        System.out.println();

        //Долното е стандартно сортиране

        Collections.sort(numbers);
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
