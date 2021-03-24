package modernjavainaction.sjm.chap05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author sjm5858@126.com
 * @date 2021/2/8 19:44
 */
public class Test2 {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(3, 5);
        List<int[]> pairs = list1.stream()
                .flatMap(i -> list2.stream()
                        .map(j -> new int[]{i, j}))
                .collect(Collectors.toList());

        for (int[] pair : pairs) {
            for (int i : pair) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
