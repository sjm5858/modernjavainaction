package modernjavainaction.sjm.chap03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @author sjm5858@126.com
 * @date 2021/2/8 17:18
 */
public class TestFunction {

    public static void main(String[] args) {

        List<Integer> list = map(Arrays.asList("sjm", "is", "goodman"), s -> s.length());
        System.out.println(list);

    }

    public static <T, R> List<R> map(List<T> list, Function<T, R> f) {
        List<R> result = new ArrayList<>();
        for (T t : list) {
            result.add(f.apply(t));
        }
        return result;
    }
}
