import java.util.Random;

public class RunnableExample implements Runnable {

    public void run() {
        Integer generatedNumber = new Random().nextInt((10)) + 1;
          int testRandom = RunnableMainClass.genNum.getAndIncrement();
//         RunnableMainClass.genNum.addAndGet(generatedNumber);
        System.out.println("Thread name " + Thread.currentThread().getName() + ", generated number " + testRandom);


    }
}
