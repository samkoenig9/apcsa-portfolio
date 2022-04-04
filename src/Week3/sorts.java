package src.Week3;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;  

public class sorts {
  public static void main(String[] args) {
    System.out.println("Selection Sort");
    analyze("selection");
    System.out.println();
    
    System.out.println("Bubble Sort");
    analyze("bubble");
    System.out.println();
    
    System.out.println("Insertion Sort");
    analyze("insertion");
    System.out.println();

    System.out.println("Merge Sort");
    analyze("merge");
    System.out.println();
  }
  public static void analyze(String method) {
    ArrayList<Integer> allTwelve = new ArrayList<Integer>();
    int TIMES = 12;
    int SIZE = 5000;
    int sum = 0;
    int time = 0;
    for(int i=0; i< TIMES; i++) {
        sortdata s = new sortdata(SIZE, method);
        for(int j = 0; j<s.getData().size(); j++) {
            // To see data, uncomment next line
            // System.out.println(s.getData());
            sum += s.getData().get(j);
        }
        System.out.println("Avg random: " + sum / ((i+1)*SIZE));
        System.out.println("Nanosec: " + s.getTimeElapsed()+"\n");
        time += s.getTimeElapsed();
        allTwelve.add(s.getTimeElapsed());
    }

    Collections.sort(allTwelve);
    
    System.out.println("Total (ns): " + time );
    System.out.println("Total (s): " + time /1000000000.0);
    System.out.println("Avg time (s)");

    
    Integer allTen = 0;
    System.out.println("Low time: "+allTwelve.remove(0)); // remove smallest
    System.out.println("High time: "+allTwelve.remove(allTwelve.size()-1)); //remove largest
    for(Integer d : allTwelve) {
      allTen += d;
    }    
  }
}