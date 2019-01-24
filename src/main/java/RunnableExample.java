import java.util.Random;

public class RunnableExample implements Runnable {

    public void run() {
        Integer generatedNumber = new Random().nextInt((10)) + 1;
        RunnableMainClass.genNum.addAndGet(generatedNumber);
        System.out.println("Thread name " + Thread.currentThread().getName() + ", generated number " + generatedNumber);


    }
}
