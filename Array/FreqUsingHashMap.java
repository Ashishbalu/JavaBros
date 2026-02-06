import java.util.HashMap;

public class FreqUsingHashMap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 2};
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0)+ 1);
        }

        for (int key : map.keySet()) {
            System.out.println(key + " occurs " + map.get(key) + " times ");
        }

    }
}
