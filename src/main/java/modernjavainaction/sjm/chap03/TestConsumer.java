package modernjavainaction.sjm.chap03;

import akka.dispatch.Foreach;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author sjm5858@126.com
 * @date 2021/2/8 17:11
 */
public class TestConsumer {

    public static void main(String[] args) {
        forEach(Arrays.asList(1, 2, 3, 4, 5, 6), i -> System.out.println(i));

    }

    public static <T> void forEach(List<T> list, Consumer<T> c) {
        for (T i : list) {
            c.accept(i);
        }
    }
}
