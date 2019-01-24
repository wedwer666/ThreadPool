import java.util.Random;
import java.util.concurrent.Callable;

public class GenerateNumbers implements Callable<Integer> {

    public static void main(String[] args){
        Random r = new Random();
        int[] values = new int[10];
        for(int i = 0; i < 10; i++) {
            int randomint = r.nextInt(10);
            values[i] = randomint;
            System.out.print(" " + randomint);
        }

        int sum = 0;
        for(int i : values) {
            sum += i;
        }
            System.out.println(" The sum of all generated numbers = " + sum);
    }

    public Integer call() throws Exception {
        return null;
    }
}
