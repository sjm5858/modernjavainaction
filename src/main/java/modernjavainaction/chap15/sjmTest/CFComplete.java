package modernjavainaction.chap15.sjmTest;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static modernjavainaction.chap15.Functions.f;
import static modernjavainaction.chap15.Functions.g;

/**
 * CompletableFuture
 *
 * @author sjm5858@126.com
 * @date 2021/2/21 10:43
 */
public class CFComplete {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        int x = 1337;

        CompletableFuture<Integer> a = new CompletableFuture<>();
        executorService.submit(() -> a.complete(f(x)));
        int b = g(x);
        System.out.println(a.get() + b);
        executorService.shutdown();
    }
}
