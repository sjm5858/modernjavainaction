package modernjavainaction.chap18.sjm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author sjm5858@126.com
 * @date 2021/2/23 21:08
 */
public class SubsetsMain {
    public static void main(String[] args) {
        List<List<Integer>> subs = subsets(Arrays.asList(1, 4, 9));
        subs.forEach(System.out::println);
    }

    private static List<List<Integer>> subsets(List<Integer> list) {
        if (list.isEmpty()) {
            List<List<Integer>> ans = new ArrayList<>();
            ans.add(Collections.emptyList());
            return ans;
        }

        Integer integer = list.get(0);
        List<Integer> subList = list.subList(1, list.size());
        List<List<Integer>> subsets = subsets(subList);
        List<List<Integer>> subsets2 = insertAll(integer, subsets);
        return concat(subsets, subsets2);
    }

    private static List<List<Integer>> concat(List<List<Integer>> a, List<List<Integer>> b) {
        List<List<Integer>> ans = new ArrayList<>(a);
        ans.addAll(b);
        return ans;
    }

    private static List<List<Integer>> insertAll(Integer integer, List<List<Integer>> subsets) {

        List<List<Integer>> ans = new ArrayList<>();
        for (List<Integer> subset : subsets) {
            List<Integer> copyList = new ArrayList<>();
            copyList.add(integer);
            copyList.addAll(subset);
            ans.add(copyList);
        }
        return ans;
    }
}
