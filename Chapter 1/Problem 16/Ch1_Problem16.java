
import java.util.ArrayList;
import java.util.Set;

public class Ch1_Problem16 {

    public static void SubSets(ArrayList<Integer> set, Set<ArrayList<Integer>> result) {
        if (set.isEmpty()) {
            result.add(new ArrayList<Integer>());
        } else {
            result.add(set);
            for (int i = 0; i < set.size(); i++) {
                ArrayList<Integer> newSet = new ArrayList<Integer>(set);
                newSet.remove(i);
                SubSets(newSet, result);
            }
        }
    }
}
