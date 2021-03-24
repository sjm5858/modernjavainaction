package modernjavainaction.chap15.sjmTest;

import modernjavainaction.chap15.Functions;

import java.util.function.IntConsumer;

/**
 * @author sjm5858@126.com
 * @date 2021/2/21 10:25
 */
public class CallbackStyleExample {
    public static void main(String[] args) {
        int x = 1337;
        Result result = new Result();
        f(x, value -> {
            result.left = value;
            System.out.println(result.left + result.right);
        });

        g(x, value -> {
            result.right = value;
            System.out.println(result.left + result.right);
        });

    }

    public static class Result {
        private int left;
        private int right;
    }

    private static void f(int x, IntConsumer dealWithResult) {
        dealWithResult.accept(Functions.f(x));
    }

    private static void g(int x, IntConsumer dealWithResult) {
        dealWithResult.accept(Functions.g(x));
    }
}
