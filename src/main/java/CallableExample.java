import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class CallableExample implements Callable<Integer> {
    public Integer call() throws Exception {
        Integer generatedNumber = new Random().nextInt((10)) + 1;
        Thread.sleep(1000);
        System.out.println("Thread name " + Thread.currentThread().getName() + ", generated number " + generatedNumber);
        return generatedNumber;
    }
}
