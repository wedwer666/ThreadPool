import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class RunnableExample implements Runnable {
    public static AtomicInteger suma =  new AtomicInteger();

     public void run() {
        Integer generatedNumber = new Random().nextInt((10)) + 1;
        RunnableMainClass.genNum.getAndAdd(generatedNumber);
        suma.getAndAdd(generatedNumber);
        System.out.println("Thread name " + Thread.currentThread().getName() + ", generated number " + generatedNumber);

    }
}
