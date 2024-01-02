import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(0,1,2));
        System.out.println(symmetricDifference(set1, set2));

    }
    public static HashSet<Integer> symmetricDifference (HashSet<Integer> set1, HashSet<Integer> set2){
        HashSet<Integer> result = new HashSet<>();
        result.addAll(set1);
        result.addAll(set2);
        System.out.println(result);
        HashSet<Integer> a = new HashSet<>();
        a.addAll(set1);
        a.addAll(set2);
        result.removeAll(a);
        return null;

    }
}