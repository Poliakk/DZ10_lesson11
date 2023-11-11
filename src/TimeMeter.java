/* DZ10_lesson11
Напишите метод, который добавляет 500000 элементов в ArrayList и LinkedList
и измерьте время, которое потрачено на это. Сравните результаты.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class TimeMeter {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>(500000);
        LinkedList<Integer> linkedList = new LinkedList<>();
        int i;
        double timeStart, timeStop;

        timeStart = System.currentTimeMillis();
        for (i = 0; i < 500000; i++) {
            linkedList.add(i, random.nextInt(1, 2));
        }
        timeStop = System.currentTimeMillis();
        double linkedListTime = timeStop - timeStart;

        timeStart = System.currentTimeMillis();
        for (i = 0; i < 500000; i++) {
            arrayList.add(i, random.nextInt(1, 2));
        }
        timeStop = System.currentTimeMillis();
        double arrayListTime = timeStop - timeStart;

        System.out.println("Время заполнения, мс");
        System.out.println("LinkedList: " + linkedListTime);
        System.out.println("ArrayList: " + arrayListTime);
    }
}