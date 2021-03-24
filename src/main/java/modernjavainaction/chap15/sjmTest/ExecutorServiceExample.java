package modernjavainaction.chap15.sjmTest;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static modernjavainaction.chap15.Functions.fo;
import static modernjavainaction.chap15.Functions.go;

/**
 * @author sjm5858@126.com
 * @date 2021/2/21 10:54
 */
public class ExecutorServiceExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        int x = 1337;

        Future<Integer> a = executorService.submit(() -> fo(x));
        Future<Integer> b = executorService.submit(() -> go(x));

        System.out.println(a.get() + b.get());

        executorService.shutdown();
    }
}
