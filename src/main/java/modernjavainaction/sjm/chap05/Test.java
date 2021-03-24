package modernjavainaction.sjm.chap05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author sjm5858@126.com
 * @date 2021/2/8 19:42
 */
public class Test {

    public static void main(String[] args) {

        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> collect = ints.stream()
                .map(i -> i * i)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
