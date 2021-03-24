package modernjavainaction.sjm.chap03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author sjm5858@126.com
 * @date 2021/2/8 16:57
 */
public class Test {

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.addAll(Arrays.asList(1, 3, 4, 2, 6, 5));
        System.out.println(ints);
        ints.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println(ints);
        ints.sort((a,b) -> b - a);
        System.out.println(ints);
        ints.sort(Test::sjmCompare);
        System.out.println(ints);

    }
    public static int sjmCompare(int a,int b){
        return a - b;
    }
}
