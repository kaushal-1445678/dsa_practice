import java.util.*;

class FindHighLowFreqElem {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 10, 15, 10, 5 };
        find(arr);
    }

    public static void find(int[] arr) {
        int n = arr.length;
        int maxF = 0;
        int maxE = 0;
        int minF = n;
        int minE = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> mpp : map.entrySet()) {
            int element = mpp.getKey();
            int count = mpp.getValue();
            if (count > maxF) {
                maxF = count;
                maxE = element;
            }
            if (count < minF) {
                minF = count;
                minE = element;
            }

        }
        System.out.println("The highest frequency element is: " + maxE);
        System.out.println("The lowest frequency element is: " + minE);

    }
}