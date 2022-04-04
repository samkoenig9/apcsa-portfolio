package src.Week3;
import java.time.Instant;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Comparator;
import src.Week3.sorts.*;

public class sortdata {
    private final ArrayList<Integer> data = new ArrayList<>();
    private final Duration timeElapsed;
    public sortdata(int size, String method) {
        Instant start = Instant.now();  // time capture -- start
        // build an array
        for (int i = 0; i < size; i++) {
            data.add((int)(Math.random() * (size+1)));
        }
        // use Inheritance and Polymorphism to replace data.sort with your own algorithm
        //BubbleSort.sort(data);
        switch(method) {
          case "selection":
            selectionSort.sort(data);
            System.out.println();
            break;
          case "bubble": 
            bubbleSort.sort(data);
            System.out.println();
            break;
          case "insertion":
            insertionSort.sort(data);
            break;
          case "merge":
            mergeSort.sort(data);
            break;
          default:
            System.out.println("Not an option");
        }
        Instant end = Instant.now();    // time capture -- end
        this.timeElapsed = Duration.between(start, end);
    }
      public ArrayList<Integer> getData() {
        return data;
    }
    public int getTimeElapsed() {
        return timeElapsed.getNano();
    }
}