package modernjavainaction.chap15.sjmTest;

import static modernjavainaction.chap15.Functions.f;
import static modernjavainaction.chap15.Functions.g;

/**
 * @author sjm5858@126.com
 * @date 2021/2/21 10:37
 */
public class ThreadExample {

    public static void main(String[] args) throws InterruptedException {
        int x = 1337;
        Result result = new Result();

        Thread t1 = new Thread(() -> {
            result.left = f(x);
        });

        Thread t2 = new Thread(() -> {
            result.right = g(x);
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(result.left + result.right);
    }

    private static class Result {
        private int left;
        private int right;
    }
}
