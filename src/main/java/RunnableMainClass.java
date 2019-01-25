import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RunnableMainClass {
    static AtomicInteger genNum = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {

        List<RunnableExample> testListRan = Stream.generate(()->new RunnableExample()).limit(9).collect(Collectors.toList());
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 9; i++) {
            executor.submit(testListRan.get(i));
        }
        executor.shutdown();
        Thread.sleep(1000);
        System.out.println("Suma numerelor generate este " + RunnableExample.suma);


    }
}
