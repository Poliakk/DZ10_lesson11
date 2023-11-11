/* DZ10_lesson11
Напишите метод, который добавляет 500000 элементов в ArrayList и LinkedList
и измерьте время, которое потрачено на это. Сравните результаты.
 */

import java.util.ArrayList;
import java.util.LinkedList;

public class TimeMeter {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<>();
        LinkedList<Object> linkedList = new LinkedList<>();
        long timeStart, timeStop;

        timeStart = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            linkedList.add(new Object());
        }
        timeStop = System.currentTimeMillis();
        long linkedListTime = timeStop - timeStart;

        timeStart = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            arrayList.add(new Object());
        }
        timeStop = System.currentTimeMillis();
        long arrayListTime = timeStop - timeStart;

        System.out.println("Время заполнения, мс");
        System.out.println("LinkedList: " + linkedListTime);
        System.out.println("ArrayList: " + arrayListTime);

        System.out.print("Разница, мс: " + (arrayListTime - linkedListTime));
    }
}