import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RunnableMainClass {
    static AtomicInteger genNum = new AtomicInteger(0);

    public static void main(String[] args) {

        List<RunnableExample> testListRan = Stream.generate(()->new RunnableExample()).limit(9).collect(Collectors.toList());
        ExecutorService executor = Executors.newFixedThreadPool(3);
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            executor.submit(testListRan.get(i));


        }

    }
}