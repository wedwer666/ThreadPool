import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class CalableMainClasss {
    public static void main(String args[]) throws Exception {
//        int sum = 0;
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Future<Integer>> list = new ArrayList<Future<Integer>>();
        Callable<Integer> callable = new CallableExample();
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            Future<Integer> future = executor.submit(callable);
            list.add(future);
        }
        for (Future<Integer> fut : list) {
                    try {
                        sum += fut.get();
//                System.out.println(" " + "Data: " + new Date() + " Denumirea threadului: " + fut.get());


            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        //shut down the executor service now
        executor.shutdown();
        System.out.println("Sum numerelor generate este: " + sum);

    }
}
