package src.Week3.sorts;
import java.util.*;
public class bubbleSort {
  public static void sort(List<Integer> list) {
    Integer temp;
    boolean sorted = false;
    while (!sorted) {
        sorted = true;
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i).compareTo(list.get(i + 1)) > 0) {
                temp = list.get(i);
                list.set(i, list.get(i + 1));
                list.set(i + 1, temp);
                sorted = false;
            }
        }
    }
  }
}